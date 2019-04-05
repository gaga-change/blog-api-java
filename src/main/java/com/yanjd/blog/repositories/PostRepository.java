package com.yanjd.blog.repositories;

import com.yanjd.blog.models.Post;
import com.yanjd.blog.models.projection.PostSmall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = PostSmall.class)
public interface PostRepository extends JpaRepository<Post, Integer> {
}
