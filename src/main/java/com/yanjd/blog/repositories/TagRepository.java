package com.yanjd.blog.repositories;

import com.yanjd.blog.models.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends MongoRepository<Tag, String> {
}
