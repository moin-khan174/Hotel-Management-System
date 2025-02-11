// src/main/java/com/example/hotelapp/model/Room.java
package com.example.hotel_app.model;

public class Room {
    private String name;
    private double price;
    private String image;

    // Constructor
    public Room(String name, double price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
