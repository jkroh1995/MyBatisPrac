package com.example.demo.controller.post;

import com.example.demo.service.PostService;
import com.fasterxml.jackson.databind.annotation.NoClass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<NoClass> postPost(@RequestBody PostPostDto dto){
        return null;
    }

}
