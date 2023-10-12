package com.example.projetguideville.vue;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetguideville.R;
import com.example.projetguideville.bean.Service;

public class ServiceDetailsActivity extends AppCompatActivity {
    private TextView txtName;
    private TextView txtDescription;
    private Service service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_details);

        // Initialize views and retrieve service data from intent extras
        txtName = findViewById(R.id.txtName);
        txtDescription = findViewById(R.id.txtDescription);

        // Retrieve service data from intent extras
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("service")) {
            service = (Service) intent.getSerializableExtra("service");
        }

        // Set service data to the views
        if (service != null) {
            txtName.setText(service.getName());
            txtDescription.setText(service.getDescription());
        }
    }
}
