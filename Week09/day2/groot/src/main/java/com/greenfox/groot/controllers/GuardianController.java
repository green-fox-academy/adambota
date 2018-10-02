package com.greenfox.groot.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardianController {

    @GetMapping("/groot")
    public ResponseEntity<ResponseJSON> imGroot(@RequestParam(required = false) String message) {
        if (message != null)
            return new ResponseEntity<ResponseJSON>(new ResponseJSON(message, "I am Groot!"), HttpStatus.OK);
        return new ResponseEntity<ResponseJSON>(new ResponseJSON("I am Groot!"), HttpStatus.BAD_REQUEST);
    }

    static class ResponseJSON {
        public String received;
        public String translated;
        public String error;

        public ResponseJSON(String received, String translated) {
            this.received = received;
            this.translated = translated;
        }

        public ResponseJSON(String error) {
            this.error = error;
        }
    }
}
