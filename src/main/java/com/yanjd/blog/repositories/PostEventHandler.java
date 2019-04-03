package com.yanjd.blog.repositories;

import com.yanjd.blog.models.Post;
import com.yanjd.blog.models.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RepositoryEventHandler(Post.class)
public class PostEventHandler {
    @Autowired
    PostRepository postRepository;

    @HandleBeforeCreate
    public void handlePostSave(Post post) {
        if (post != null) {
            System.out.println("HandleBeforeCreate:" + post.getTitle());
        }
    }
    @HandleAfterLinkSave
    public  void onAfterLinkSave(Post post, Object linked) {
        StringBuilder stringBuilder = new StringBuilder();
        for(Tag tag: post.getTags()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(tag.getId());
        }
        post.setTagIds(stringBuilder.toString());
        postRepository.save(post);
        System.out.println("HandleAfterLinkSave");
    }
    @HandleAfterLinkDelete
    public  void onAfterLinkDelete(Post post, Object linked) {
        System.out.println(linked);
        System.out.println("HandleAfterLinkDelete");
    }

}
