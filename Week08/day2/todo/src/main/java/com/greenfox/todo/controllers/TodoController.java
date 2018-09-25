package com.greenfox.todo.controllers;

import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/todo"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive) {
        boolean listActives = false;
        if (isActive != null && isActive.equals("true")) listActives = true;

        model.addAttribute("listActives", listActives);
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

    @GetMapping("/todo/add")
    public String addGet() {
        return "todoadd";
    }

    @PostMapping("/todo/add")
    public String addPost(String title) {
        todoRepository.save(new Todo(title));
        return "redirect:/todo/?isActive=false";
    }
}
