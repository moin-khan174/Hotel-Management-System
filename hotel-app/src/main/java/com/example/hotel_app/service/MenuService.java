package com.example.hotel_app.service;

// src/main/java/com/example/hotelapp/service/RoomService.java


// src/main/java/com/example/hotelapp/service/MenuService.java


import com.example.hotel_app.model.MenuItem;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MenuService {
    public List<MenuItem> getMenu() {
        return Arrays.asList(
            new MenuItem("Dal Baati", 200),
            new MenuItem("Idli Sambhar", 150),
            new MenuItem("Pooran Poli", 100),
            new MenuItem("Indian Meal Thali", 200),
            new MenuItem("Jumbo Maharaja Thali", 500)
        );
    }
}