package com.example.ddemidovskiy.fma.albums;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by ddemidovskiy on 19.09.2016.
 */


/*
    Содержит текстовые константы для выполнения sql-запросов,
    а также непосредственно создает и пересоздаёт базу.
 */
public final class AlbumsTable
{
    public static final String TABLE_NAME = "albums";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_IMAGE = "album_image_file";

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
        Log.d("dimmy", "AlbumsTable create");
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
        Log.d("dimmy", "AlbumsTable update");
        sqLiteDatabase.execSQL(SQL_DROP);
        onCreate(sqLiteDatabase);
    }
}
