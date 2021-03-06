package com.example.ddemidovskiy.fma;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.ddemidovskiy.fma.artists.ArtistsTable;

/**
 * Created by ddemidovskiy on 19.09.2016.
 */



public class DBHelper extends SQLiteOpenHelper {

    private static final String DB_FILE = "freemusicarchive.db";
    private static final  int DB_VERSION = 2;

    public DBHelper(Context context) //, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, DB_FILE, null, DB_VERSION);
        Log.d("dimmy", "DB helper construct");
    }


    /* Вызывается однократно при установке приложения */
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        Log.d("dimmy", "DB helper create");
        ArtistsTable.onCreate(db);
    }


    /* Вызывается при изменении DB_VERSION */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        Log.d("dimmy", "DB helper upgrade");
        ArtistsTable.onUpgrade(db);
    }
}
