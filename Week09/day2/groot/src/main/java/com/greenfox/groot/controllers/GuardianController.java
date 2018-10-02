package com.greenfox.groot.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardianController {

    @GetMapping("/groot")
    public ResponseEntity<GrootResponseJSON> imGroot(@RequestParam(required = false) String message) {
        if (message != null)
            return new ResponseEntity<>(new GrootResponseJSON(message, "I am Groot!"), HttpStatus.OK);
        return new ResponseEntity<>(new GrootResponseJSON("I am Groot!"), HttpStatus.BAD_REQUEST);
    }

    static class GrootResponseJSON {
        public String received;
        public String translated;
        public String error;

        public GrootResponseJSON(String received, String translated) {
            this.received = received;
            this.translated = translated;
        }

        public GrootResponseJSON(String error) {
            this.error = error;
        }
    }

    //

    @GetMapping("/yondu")
    public ResponseEntity<YonduResponseJSON> yondusArrow(@RequestParam(required = false) Double distance, @RequestParam(required = false) Double time) {
        if (distance != null && time != null)
            return new ResponseEntity<>(new YonduResponseJSON(distance, time, distance / time), HttpStatus.OK);
        else if (distance == null && time != null)
            return new ResponseEntity<>(new YonduResponseJSON("Distance missing"), HttpStatus.BAD_REQUEST);
        else if (time == null && distance != null)
            return new ResponseEntity<>(new YonduResponseJSON("Time missing"), HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(new YonduResponseJSON("Distance and Time missing"), HttpStatus.BAD_REQUEST);
    }

    static class YonduResponseJSON {
        public double distance;
        public double time;
        public double speed;
        public String error;

        public YonduResponseJSON(double distance, double time, double speed) {
            this.distance = distance;
            this.time = time;
            this.speed = speed;
        }

        public YonduResponseJSON(String error) {
            this.error = error;
        }
    }
}
