package com.example.blog.controller;

import com.example.blog.service.SQLService; // we have to import our service to access it
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class SQLController {

    @Autowired
    private SQLService sqlService;

    @GetMapping("/all")
    public List<Map<String, Object>> getAllBlogPosts() {
        return sqlService.getAllBlogPosts();
    }

    @GetMapping("/countAllPosts")
    public Integer countAllBlogPosts() {
        return sqlService.countAllBlogPosts();
    }

    // the rest of your endpoints
}