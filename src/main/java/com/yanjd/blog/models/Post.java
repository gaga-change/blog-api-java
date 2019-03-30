package com.yanjd.blog.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Data
@Document("blog_post")
public class Post {
    private ObjectId id;
    private String title;
    private String content;
    private ArrayList<String> tags;
    private ArrayList<String> categories;
    private String intro;
    private String markdown;
    private Date date;
}
