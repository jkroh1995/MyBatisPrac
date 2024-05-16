package com.example.demo.model;

import lombok.Getter;

@Getter
public class Post {

    private long id;
    private Member writer;
    private String title;
    private String content;
}
