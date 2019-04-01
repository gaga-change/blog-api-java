package com.yanjd.blog.controller;

import com.mongodb.MongoClient;
import org.springframework.data.mongodb.core.MongoTemplate;

public class BaseController {
    MongoTemplate template = new MongoTemplate(new MongoClient(), "test");
}
