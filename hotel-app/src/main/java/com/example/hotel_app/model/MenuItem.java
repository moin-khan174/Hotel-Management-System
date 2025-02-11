package com.example.hotel_app.model;

// src/main/java/com/example/hotelapp/model/MenuItem.java


public class MenuItem {
    private String name;
    private double price;

    // Constructors, Getters, and Setters
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}