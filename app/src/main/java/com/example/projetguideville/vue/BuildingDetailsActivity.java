package com.example.projetguideville.vue;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetguideville.R;
import com.example.projetguideville.adapter.ServiceAdapter;
import com.example.projetguideville.bean.Building;

public class BuildingDetailsActivity extends AppCompatActivity {
    private TextView txtName;
    private TextView txtAddress;
    private TextView txtDescription;
    private RecyclerView recyclerViewServices;
    private Building building;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_details);

        // Initialize views and retrieve building data from intent extras
        txtName = findViewById(R.id.txtName);
        txtAddress = findViewById(R.id.txtAddress);
        txtDescription = findViewById(R.id.txtDescription);
        recyclerViewServices = findViewById(R.id.recyclerViewServices);

        // Retrieve building data from intent extras
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("building")) {
            building = (Building) intent.getSerializableExtra("building");
        }

        // Set building data to the views
        if (building != null) {
            txtName.setText(building.getName());
            txtAddress.setText(building.getAddress());
            txtDescription.setText(building.getDescription());
        }

        // Set up RecyclerView and adapter
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewServices.setLayoutManager(layoutManager);
        ServiceAdapter serviceAdapter = new ServiceAdapter(building.getServices());
        recyclerViewServices.setAdapter(serviceAdapter);
    }
}

