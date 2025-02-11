package com.example.hotel_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CanteenController {

    @GetMapping("/canteen") // Map this method to /canteen
    public String getCanteenMenu(Model model) {
        // Define the menu items directly in the controller
        List<MenuItem> menu = Arrays.asList(
            new MenuItem("Dal Baati", 200),
            new MenuItem("Idli Sambhar", 150),
            new MenuItem("Pooran Poli", 100),
            new MenuItem("Indian Meal Thali", 200),
            new MenuItem("Jumbo Maharaja Thali", 500)
        );

        // Add the menu to the model
        model.addAttribute("menu", menu);

        // Return the canteen template
        return "canteen"; // Refers to src/main/resources/templates/canteen.html
    }

    // Define a simple MenuItem class (can be moved to a model package if needed)
    private static class MenuItem {
        private String name;
        private double price;

        public MenuItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}