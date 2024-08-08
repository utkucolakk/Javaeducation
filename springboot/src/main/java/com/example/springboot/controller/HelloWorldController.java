package com.example.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {


    @GetMapping("/sayBuenos")
    public String sayBuenos() {
        return "hello amigo!!";
    }

    @PostMapping("/add")    // C -> CREATE
    public String add() {
        return "added";
    }

    @GetMapping("/sayHello") // R -> READ
    public String sayHello() {
        return "hello world!";
    }

    @PutMapping("/update")  // U -> UPDATE
    public String update() {
        return "update";
    }

    @DeleteMapping("/delete") // D -> DELETE
    public String delete() {
        return "delete";
    }
}