package com.yanjd.blog.repositories;

import com.yanjd.blog.models.Post;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
    Post findById(ObjectId id);
}
