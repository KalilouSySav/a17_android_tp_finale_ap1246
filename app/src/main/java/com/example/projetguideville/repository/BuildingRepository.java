package com.example.projetguideville.repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.projetguideville.bean.Building;
import com.example.projetguideville.bean.Service;
import com.example.projetguideville.dao.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;

public class BuildingRepository {
    private DatabaseHelper databaseHelper;
    public BuildingRepository(Context context, List<String> queries) {
        databaseHelper = new DatabaseHelper(context, queries);
    }

    public List<Building> getAllBuildings() {
        List<Building> buildings = new ArrayList<>();

        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM building", null);

        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));
                String address = cursor.getString(cursor.getColumnIndexOrThrow("address"));
                String description = cursor.getString(cursor.getColumnIndexOrThrow("description"));

                List<Service> services = new ArrayList<>();
                Cursor cursorService = db.rawQuery("SELECT * FROM service WHERE building_id = ?", new String[]{String.valueOf(id)});
                if (cursorService.moveToFirst()) {
                    do {
                        int idService = cursorService.getInt(cursorService.getColumnIndexOrThrow("id"));
                        String nameService = cursorService.getString(cursorService.getColumnIndexOrThrow("name"));
                        String descriptionService = cursorService.getString(cursorService.getColumnIndexOrThrow("description"));
                        Service service = new Service(idService, nameService, descriptionService);
                        services.add(service);
                    } while (cursorService.moveToNext());
                }

                Building building = new Building(id, name, address, description, services);
                buildings.add(building);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return buildings;
    }

    public void addBuilding(Building building) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", building.getName());
        values.put("address", building.getAddress());
        values.put("description", building.getDescription());
        db.insert("building", null, values);
        db.close();
    }
}


