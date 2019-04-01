package com.yanjd.blog.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Data
@Document("blog_v2_post")
public class Post {
    ObjectId id;
    String title;
    String content;
    ArrayList<String> tags;
    ArrayList<String> categories;
    String intro;
    String markdown;
    Date date;
}
