package com.greenfox.colors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorsApplication implements CommandLineRunner {

    private MyColor color;

    public ColorsApplication(MyColor color) {
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColorsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        color = new GreyColor();
        color.printColor();
    }
}
