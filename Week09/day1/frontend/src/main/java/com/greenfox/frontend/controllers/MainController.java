package com.greenfox.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    //

    @GetMapping("/doubling")
    @ResponseBody
    public Doubled doubling(@RequestParam(required = false) Integer input) {
        if (input == null) return new Doubled("Error");
        return new Doubled(input, input * 2);
    }

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

    //

    @GetMapping("/greeter")
    @ResponseBody
    public Greeting greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null || title == null) return new Greeting("Error");
        return new Greeting(name, title);
    }

    static class Greeting {
        public String welcome_message;
        public String error;

        public Greeting(String name, String title) {
            welcome_message = "Oh, hi there " + name + ", my dear " + title;
        }

        public Greeting(String error) {
            this.error = error;
        }
    }

    //

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public Appended appending(@PathVariable String appendable) {
        if (appendable != null) return new Appended(appendable);
        return null;
    }

    static class Appended {
        public String appended;

        public Appended(String appendable) {
            appended = appendable + "a";
        }
    }

    //

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Dountil dountil(@PathVariable String action, @RequestBody(required = false) DountilInput input) {
        if (action.equals("sum") && input != null) {
            int sum = 0;
            for (int i = 0; i <= input.until; i++) {
                sum += i;
            }
            return new Dountil(sum);
        } else if (action.equals("factor") && input != null) {
            int factorial = 1;
            for (int i = 1; i <= input.until; i++) {
                factorial *= i;
            }
            return new Dountil(factorial);
        }
        return new Dountil("Error");
    }

    static class DountilInput {
        public int until;
    }

    static class Dountil {
        public int result;
        public String error;

        public Dountil(int result) {
            this.result = result;
        }

        public Dountil(String error) {
            this.error = error;
        }
    }
}
