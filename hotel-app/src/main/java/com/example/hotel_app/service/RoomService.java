package com.example.hotel_app.service;

import com.example.hotel_app.model.Room;
// src/main/java/com/example/hotelapp/service/RoomService.java



import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RoomService {
    public List<Room> getRooms() {
        return Arrays.asList(
            new Room("Single Room", 2000, "/images/single.jpg"),
            new Room("Double Room", 5000, "/images/double.jpg"),
            new Room("Suite", 8000, "/images/suite.jpg")
        );
    }
}
