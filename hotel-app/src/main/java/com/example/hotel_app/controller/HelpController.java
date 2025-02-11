package com.example.hotel_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelpController {

    @GetMapping("/help") // Map this method to /help
    public String getHelpPage(Model model) {
        // Define FAQs directly in the controller
        List<String> faqs = Arrays.asList(
            "How do I book a room? - Select the 'Booking' tab and fill in your details.",
            "What are the room types available? - Single, Double, and Suite.",
            "How do I contact support? - Call our helpline at 1800-800."
        );

        // Add FAQs to the model
        model.addAttribute("faqs", faqs);

        // Return the help template
        return "help"; // Refers to src/main/resources/templates/help.html
    }
}