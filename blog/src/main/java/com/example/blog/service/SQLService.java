package com.example.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate; // importing the template we use to connect to the database
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service // identifies that it's a service
public class SQLService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Method to get all blog posts
    public List<Map<String, Object>> getAllBlogPosts() {
        String sql = "SELECT * FROM Blog_Posts_articles"; // this is where your SQL queries go
        return jdbcTemplate.queryForList(sql);
    }

    public Integer countAllBlogPosts() {
        String sql = "SELECT COUNT(*) FROM Blog_Posts_articles"; // this is where your SQL queries go
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    // Include the rest of your methods here - one for each SQL query you want to run against your database
}
