package com.recap.springboot.rresttemplate.controller;

import com.recap.springboot.rresttemplate.dto.Post;
import com.recap.springboot.rresttemplate.service.PlaceHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceHolderController {

    @Autowired
    private PlaceHolderService placeHolderService;

    @GetMapping("/post")
    public List<Post> getAllPostList() {
        return placeHolderService.getAllPostList();
    }

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post) {
        return placeHolderService.createPost(post);
    }
}
