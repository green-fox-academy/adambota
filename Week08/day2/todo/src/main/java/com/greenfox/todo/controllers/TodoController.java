package com.greenfox.todo.controllers;

import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "redirect:/todo";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        if (todoRepository.findById(id).isPresent()) todoRepository.deleteById(id);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/edit")
    public String editGet(@PathVariable Long id, Model model) {
        Todo todo = todoRepository.findById(id).get();
        model.addAttribute("id", todo.getId());
        model.addAttribute("title", todo.getTitle());
        model.addAttribute("urgent", todo.isUrgent());
        model.addAttribute("done", todo.isDone());
        return "todoedit";
    }

    @PostMapping("/{id}/edit")
    public String editPost(@PathVariable Long id, String title, boolean urgent, boolean done) {
        Todo todo = todoRepository.findById(id).get();
        todo.setTitle(title);
        todo.setUrgent(urgent);
        todo.setDone(done);
        todoRepository.save(todo);
        return "redirect:/todo";
    }
}
