package com.example.projetguideville.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetguideville.R;
import com.example.projetguideville.bean.Building;

import java.util.List;

public class BuildingAdapter extends RecyclerView.Adapter<BuildingAdapter.BuildingViewHolder> {
    private List<Building> buildings;

    public BuildingAdapter(List<Building> allBuildings) {
        this.buildings = allBuildings;
    }

    @NonNull
    @Override
    public BuildingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_building_details, parent, false);
        return new BuildingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BuildingViewHolder holder, int position) {
        Building building = buildings.get(position);
        holder.bind(building);
    }

    @Override
    public int getItemCount() {
        return buildings.size();
    }

    public static class BuildingViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName;
        private TextView txtAddress;
        private RecyclerView recyclerViewServices;

        public BuildingViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
            recyclerViewServices = itemView.findViewById(R.id.recyclerViewServices);
        }

        public void bind(Building building) {
            txtName.setText(building.getName());
            txtAddress.setText(building.getAddress());

            LinearLayoutManager layoutManager = new LinearLayoutManager(itemView.getContext());
            recyclerViewServices.setLayoutManager(layoutManager);

            ServiceAdapter serviceAdapter = new ServiceAdapter(building.getServices());
            recyclerViewServices.setAdapter(serviceAdapter);
        }
    }
}



