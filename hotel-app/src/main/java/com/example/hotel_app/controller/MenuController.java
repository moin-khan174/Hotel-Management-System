package com.example.hotel_app.controller;

// src/main/java/com/example/hotelapp/controller/MenuController.java


// src/main/java/com/example/hotelapp/controller/MenuController.java

import com.example.hotel_app.model.MenuItem;
import com.example.hotel_app.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/menu")
    public String getMenu(Model model) {
        List<MenuItem> menu = menuService.getMenu();
        model.addAttribute("menu", menu);
        return "menu";
    }
}