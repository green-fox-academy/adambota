package com.greenfox.greenfox.controllers;

import com.greenfox.greenfox.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenfoxController {

    private StudentService studentService;

    public GreenfoxController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/gfa")
    public String gfa(Model model) {
        model.addAttribute("list", "/gfa/list");
        model.addAttribute("add", "/gfa/add");
        model.addAttribute("number", studentService.count());
        model.addAttribute("check", "/gfa/check");
        return "gfa";
    }

    @RequestMapping("/gfa/list")
    public String gfaList(Model model) {
        model.addAttribute("list", studentService.findAll());
        return "gfalist";
    }

    @RequestMapping("/gfa/add")
    public String gfaAdd() {
        return "gfaadd";
    }

    @RequestMapping("gfa/save")
    public String gfaSave(@RequestParam("name") String name) {
        studentService.save(name);
        return "gfasave";
    }

    @GetMapping("gfa/check")
    public String gfaCheckGet() {
        return "gfacheckget";
    }

    @PostMapping("gfa/check")
    public String gfaCheckPost(Model model, @RequestParam("name") String name) {
        model.addAttribute("exists", studentService.checkIfExists(name));
        return "gfacheckpost";
    }
}
