package com.greenfox.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class trickController {

    @GetMapping("/trickcenter")
    public String trickGet(String name, Model model) {
        model.addAttribute("name", name);
        return "trick";
    }

    @PostMapping("/trickcenter")
    public String trickPost(String name, String trick, Model model) {
        if (!MainController.foxService.getFox(name).getTricks().contains(trick)) {
            MainController.foxService.getFox(name).getTricks().add(trick);
        }
        return "redirect:/?name=" + name;
    }
}
