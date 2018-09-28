package com.greenfox.reddit.controllers;

import com.greenfox.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final PostService postService;

    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postService.findAllByOrderByScoreDesc());
        return "index";
    }

    @GetMapping("/submit")
    public String getSubmit() {
        return "submit";
    }

    @PostMapping("/submit")
    public String postSubmit(String title, String url) {
        postService.savePost(title, url);
        return "redirect:/";
    }

    @PostMapping("/upvote/{id}")
    public String upvote(@PathVariable long id) {
        postService.upvote(id);
        return "redirect:/";
    }

    @PostMapping("/downvote/{id}")
    public String downvote(@PathVariable long id) {
        postService.downvote(id);
        return "redirect:/";
    }
}
