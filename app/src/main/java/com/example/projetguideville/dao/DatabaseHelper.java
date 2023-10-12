package com.example.projetguideville.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "TOURISME__FUN.db";
    private static final int DATABASE_VERSION = 1;

    private static final String CREATE_TABLE_BUILDING = "CREATE TABLE Building (\n" +
            "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "    name VARCHAR(255) NOT NULL,\n" +
            "    address VARCHAR(255) NOT NULL,\n" +
            "    description TEXT\n" +
            ");";

    private static final String CREATE_TABLE_SERVICE = "CREATE TABLE Service (\n" +
            "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "    name VARCHAR(255) NOT NULL,\n" +
            "    description TEXT,\n" +
            "    building_id INT,\n" +
            "    FOREIGN KEY (building_id) REFERENCES Building(id)\n" +
            ");";

    private final List<String> queries;

    public DatabaseHelper(@Nullable Context context, List<String> queries) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.queries = queries;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_BUILDING);
        db.execSQL(CREATE_TABLE_SERVICE);
        for (String query : queries) {
            db.execSQL(query);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Database upgrade logic if needed
    }
}