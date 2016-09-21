package com.example.ddemidovskiy.fma;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<Artists> {


    private static final String API_URL = "https://freemusicarchive.org";
    private static final String API_KEY = "SM8RACT0OT76MKD4";

    private Retrofit retrofit;
    private FmaService service;
    private ArtistsDBHelper helper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())     // будем конвертировать JSON в Java Objects
                .build();

        service = retrofit.create(FmaService.class);

        helper = new ArtistsDBHelper(this);

        loadMore();
    }








    /*
        Действия при получении ответа от сервера

        Dataset - это набор данных для одного исполнителя

    */
    @Override
    public void onResponse(Call<Artists> call, Response<Artists> response) {

        Log.d("dimmy", "onResponse");

        Artists body;

        try
        {
            body = response.body();
        }
        catch (Exception e)
        {
            Log.d("dimmy", "Проблемы с ответом сервера");
            Toast.makeText(this, "Проблемы с ответом сервера", Toast.LENGTH_SHORT).show();
            return;
        }


        // Запись в базу
        SQLiteDatabase db = helper.getWritableDatabase();
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
    }



    @Override
    public void onFailure(Call<Artists> call, Throwable t) {
        Toast.makeText(getApplicationContext(), "Проблемы с загрузкой", Toast.LENGTH_SHORT).show();
    }




    private void loadMore(){ //int page, String search) {
        Call <Artists> call = service.artists(
//                "artists",
//                "json",
                API_KEY
        );

//        loading = true;

        call.enqueue(this);
        Log.d("dimmy", "Request sent.");
    }
}
