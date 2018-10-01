package com.greenfox.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    //

    static class Doubled {
        public int received;
        public int result;
        public String error;

        public Doubled(int received, int result) {
            this.received = received;
            this.result = result;
        }

        public Doubled(String error) {
            this.error = error;
        }
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Doubled doubling(@RequestParam(required = false) Integer input) {
        if (input == null) return new Doubled("Error");
        return new Doubled(input, input * 2);
    }

    //
}
