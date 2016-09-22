package com.example.ddemidovskiy.fma.artists;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by ddemidovskiy on 19.09.2016.
 */


/*
    Содержит текстовые константы для выполнения sql-запросов,
    а также непосредственно создает и пересоздаёт базу.
 */
public final class ArtistsTable {
    public static final String TABLE_NAME = "artists";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_IMAGE = "artist_image_file";

    public static final String SQL_CREATE = String.format(
            "create table %s (%s integer primary key autoincrement, %s text not null)",
            TABLE_NAME, COLUMN_ID, COLUMN_IMAGE);

    public static final String SQL_DROP = String.format(
            "drop table if exists %s",
            TABLE_NAME);

    public static final String SQL_INSERT = String.format(
            "insert into %s (%s) values (?)",
            TABLE_NAME, COLUMN_IMAGE);


    public static void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        Log.d("dimmy", "ArtistsTable create");
        try
        {
            sqLiteDatabase.execSQL(SQL_CREATE);
        }
        catch (SQLException ex)
        {
            Log.d("dimmy", ex.getMessage());
        }
    }


    public static void onUpgrade(SQLiteDatabase sqLiteDatabase)
    {
        Log.d("dimmy", "ArtistsTable update");
        sqLiteDatabase.execSQL(SQL_DROP);
        onCreate(sqLiteDatabase);
    }
}
