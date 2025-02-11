package com.example.hotel_app.controller;

// src/main/java/com/example/hotelapp/controller/RoomController.java


// src/main/java/com/example/hotelapp/controller/RoomController.java

import com.example.hotel_app.model.Room;
import com.example.hotel_app.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/rooms")
    public String getRooms(Model model) {
        List<Room> rooms = roomService.getRooms();
        model.addAttribute("rooms", rooms);
        return "rooms";
    }
}