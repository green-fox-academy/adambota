package com.greenfox.foxclub.controllers;

import com.greenfox.foxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final FoxService foxService;

    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String index(String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
