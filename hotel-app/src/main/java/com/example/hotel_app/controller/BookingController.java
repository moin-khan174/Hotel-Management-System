package com.example.hotel_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookingController {

    // Display the booking form
    @GetMapping("/booking")
    public String showBookingForm() {
        return "booking"; // Refers to src/main/resources/templates/booking.html
    }

    // Handle form submission
    @PostMapping("/booking")
    public String handleBooking(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String phone,
            @RequestParam String roomType,
            Model model) {

        // Process the booking (e.g., save to database)
        String confirmationMessage = String.format(
                "Booking confirmed for %s (Email: %s, Phone: %s) in %s",
                name, email, phone, roomType
        );

        // Add confirmation message to the model
        model.addAttribute("message", confirmationMessage);

        // Return a confirmation page (you can create a confirmation.html)
        return "confirmation";
    }
}