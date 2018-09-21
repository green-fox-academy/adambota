package com.greenfox.foxclub.controllers;

import com.greenfox.foxclub.models.Fox;
import com.greenfox.foxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    static final FoxService foxService = new FoxService();

    //public MainController(FoxService foxService) {
    //    this.foxService = foxService;
    //}


    @GetMapping("/")
    public String index(String name, Model model) {
        if (foxService.getFox(name) == null) {
            foxService.addFox(name);
        }
        Fox fox = foxService.getFox(name);
        model.addAttribute("name", fox.getName());
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        model.addAttribute("trickCount", fox.getTricks().size());
        model.addAttribute("tricks", fox.getTricks());
        return "index";
    }
}
