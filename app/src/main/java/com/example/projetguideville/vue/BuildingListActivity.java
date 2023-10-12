package com.example.projetguideville.vue;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetguideville.R;
import com.example.projetguideville.adapter.BuildingAdapter;
import com.example.projetguideville.repository.BuildingRepository;
import com.example.projetguideville.utils.SQLQueryParser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class BuildingListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BuildingAdapter buildingAdapter;
    private BuildingRepository buildingRepository;

    private SQLQueryParser sqlQueryParser;
    private String filename = "raw/insert.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_list);

        String rawQuery = "";

        sqlQueryParser = new SQLQueryParser();

        List<String> queries;
        queries = sqlQueryParser.extractQueries();


        // Initialize BuildingRepository and populate with buildings
        buildingRepository = new BuildingRepository(this, queries);

        // Initialize RecyclerView and BuildingAdapter
        recyclerView = findViewById(R.id.recyclerViewBuildings);
        buildingAdapter = new BuildingAdapter(buildingRepository.getAllBuildings());

        // Set RecyclerView layout manager and adapter
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(buildingAdapter);

    }
}

