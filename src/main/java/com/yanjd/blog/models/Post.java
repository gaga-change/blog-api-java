package com.yanjd.blog.models;

import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class Post {
    private ObjectId id;
    private String title;
}
