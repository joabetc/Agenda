package com.example.jtcosta.agenda.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jtcosta on 28/03/2018.
 */

public class StudentDAO extends SQLiteOpenHelper {
    public StudentDAO(Context context) {
        super(context, "Agenda", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE Students (id INTEGER PRIMARY KEY, name TEXT NOT NULL, address TEXT, phone TEXT, site TEXT, score REAL);";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Students";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
}
