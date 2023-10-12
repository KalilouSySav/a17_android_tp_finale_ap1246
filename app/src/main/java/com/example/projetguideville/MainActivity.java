package com.example.projetguideville;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projetguideville.vue.BuildingListActivity;
import com.example.projetguideville.vue.MapActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnOpenBuildingList;
    private Button btnOpenMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        btnOpenBuildingList = findViewById(R.id.btnOpenBuildingList);
        btnOpenMap = findViewById(R.id.btnOpenMap);

        // Set click listeners for buttons
        btnOpenBuildingList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBuildingListActivity();
            }
        });

        btnOpenMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapActivity();
            }
        });
    }

    private void openBuildingListActivity() {
        Intent intent = new Intent(MainActivity.this, BuildingListActivity.class);
        startActivity(intent);
    }

    private void openMapActivity() {
        Intent intent = new Intent(MainActivity.this, MapActivity.class);
        startActivity(intent);
    }
}