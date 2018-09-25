package com.greenfox.todo.controllers;

import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/todo"})
    public String list(Model model, String isActive) {
        boolean listActives = false;
        if (isActive.equals("true")) listActives = true;

        model.addAttribute("listActives", listActives);
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }
}
