package com.yanjd.blog.controller;

import com.yanjd.blog.repositories.PostRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("posts")
public class PostController {
    private PostRepository repository;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String  hello () {
        return "Hello";

    }
}
