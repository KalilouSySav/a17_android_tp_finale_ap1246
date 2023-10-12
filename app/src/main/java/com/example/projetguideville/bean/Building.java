package com.example.projetguideville.bean;

import java.util.List;

public class Building {
    private int id;
    private String name;
    private String address;
    private String description;
    private List<Service> services;

    public Building() {
    }

    public Building(int id, String name, String address, String description, List<Service> services) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.services = services;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
