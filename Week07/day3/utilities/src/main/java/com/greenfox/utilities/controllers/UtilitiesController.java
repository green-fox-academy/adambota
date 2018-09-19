package com.greenfox.utilities.controllers;

import com.greenfox.utilities.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilitiesController {

    private UtilityService utilityService;

    public UtilitiesController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String usefuls(Model model) {
        model.addAttribute("coloredLink", "/useful/colored");
        model.addAttribute("email", "/useful/email?email=is@this.valid");
        model.addAttribute("caesar", "/useful/caesar?text=example&number=5");
        return "usefuls";
    }

    @RequestMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String email(Model model, @RequestParam("email") String email) {
        model.addAttribute("email", email);
        model.addAttribute("valid", utilityService.validateEmail(email));
        return "email";
    }

    @GetMapping("/useful/caesar")
    public String caesar(Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
        model.addAttribute("text", text);
        model.addAttribute("number", number);
        model.addAttribute("shifted", utilityService.caesar(text, number));
        return "caesar";
    }
}
