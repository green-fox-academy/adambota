package com.greenfox.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginGet() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(String name, Model model) {
        return "redirect:/?name=" + name;
    }
}
