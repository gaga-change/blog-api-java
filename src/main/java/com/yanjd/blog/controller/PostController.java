package com.yanjd.blog.controller;

import com.yanjd.blog.models.Post;
import com.yanjd.blog.repositories.PostRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("posts")
public class PostController extends BaseController{
    private PostRepository repository;

    @RequestMapping(value = "tags", method = RequestMethod.GET)
    public List<String> findAllTags() {
        return template.query(Post.class)
                .distinct("tags").as(String.class).all();
    }
}
