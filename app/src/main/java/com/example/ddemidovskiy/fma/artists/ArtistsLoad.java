package com.example.ddemidovskiy.fma.artists;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

import com.example.ddemidovskiy.fma.DBHelper;
import com.example.ddemidovskiy.fma.Load;
import com.example.ddemidovskiy.fma.MainActivity;
import com.example.ddemidovskiy.fma.FmaService;
import com.example.ddemidovskiy.fma.artists.Dataset;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ddemidovskiy on 21.09.2016.
 */
public class ArtistsLoad implements Callback<Artists>, Load
{

    private static final String API_URL = "https://freemusicarchive.org";
    private static final String API_KEY = "SM8RACT0OT76MKD4";
    private static final int API_LIMIT = 20;

    private Retrofit retrofit;
    private FmaService service;
    //private DBHelper helper;
    private ArtistAdapter adapter;



    @Override
    public ArtistAdapter getAdapter() { return adapter; }


    /* начальная настройка */
    @Override
    public void init(Context context)
    {
        Log.d("dimmy", "ArtistsLoad: init start.");

        // настройки http-клиента
        retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())     // будем конвертировать JSON в Java Objects
                .build();

        // сервис - для непосредственно запросов к API
        service = retrofit.create(FmaService.class);
        Log.d("dimmy", "ArtistsLoad: retrofit created.");

        // хэлпер - для получения базы на чтение или запись
        //helper = new DBHelper(context);

        // адаптер - для связи данных с представлением
        adapter = new ArtistAdapter(context, null, 0);
        Log.d("dimmy", "AlbumsLoad: adapter created.");

    }






    /* запрос */
    @Override
    public void loadMore() //int page, String search) {
    {
        Call <Artists> call = service.artists(API_KEY, API_LIMIT);
        //loading = true;
        call.enqueue(this);
        Log.d("dimmy", "ArtistsLoad: Request sent.");
    }





    @Override
    public void startOver() {
        MainActivity.helper.getWritableDatabase().delete(ArtistsTable.TABLE_NAME, null, null);
        //currentPage = 1;
        loadMore();//currentPage, tag);

    }



    /* ответ */
    @Override
    public void onResponse(Call<Artists> call, Response<Artists> response) {

        Log.d("dimmy", "ArtistsLoad: onResponse");


        // Разбор ответа
        Artists body;
        try
        {
            body = response.body();
        }
        catch (Exception e)
        {
            Log.d("dimmy", "Проблемы с ответом сервера");
            //Toast.makeText(this, "Проблемы с ответом сервера", Toast.LENGTH_SHORT).show();
            return;
        }


        // Запись в базу
        SQLiteDatabase db = MainActivity.helper.getWritableDatabase();
        SQLiteStatement statement = db.compileStatement(ArtistsTable.SQL_INSERT);
        db.beginTransaction();

        for (Dataset artist: body.getDataset())
        {
            String url = artist.getArtistImageFile();
            Log.d("dimmy", "artist image: " + url);
            statement.bindString(1, url);
            statement.execute();
        }

        db.setTransactionSuccessful();
        db.endTransaction();

        Cursor cursor = getCursor();
        updateCursor(cursor);
    }





    /* ошибка */
    @Override
    public void onFailure(Call<Artists> call, Throwable t) {
        Log.d("dimmy", "http failure");
        //Toast.makeText(context), "Проблемы с загрузкой", Toast.LENGTH_SHORT).show();

    }




    /* получение данных */
    private Cursor getCursor() {
        return MainActivity.helper.getReadableDatabase().query(
                ArtistsTable.TABLE_NAME,    // таблица
                null,                       // колонки
                null,                       // WHERE
                null,                       // параметры WHERE
                null,                       // GROUP BY
                null,                       // HAVING
                null                        // ORDER BY
        );
    }


    /* обновление данных */
    private void updateCursor(Cursor cursor) {
        adapter.swapCursor(cursor);
    }









}

