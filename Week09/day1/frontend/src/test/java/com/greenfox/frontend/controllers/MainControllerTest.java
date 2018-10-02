package com.greenfox.frontend.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainControllerTest {

    @Test
    public void index() {
        MainController controller = new MainController();
        String result = controller.index();
        assertEquals("index", result);
    }
}