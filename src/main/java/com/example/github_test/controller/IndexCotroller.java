package com.example.github_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexCotroller {

    @GetMapping("/")
    public String index() {

        return "To-do Application !!";
    }


}
