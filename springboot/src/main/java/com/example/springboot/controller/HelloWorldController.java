package com.example.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {


    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello world!";
    }

    @GetMapping("/sayBuenos")
    public String sayBuenos() {
        return "hello amigo!";
    }

    @PostMapping("/add")
    public String add() {
        return "added";
    }

    @PutMapping("/update")
    public String update() {
        return "update";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "delete";
    }
}
