package com.yanjd.blog.models.projection;

import com.yanjd.blog.models.Post;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;
import java.util.Date;

@Projection(name = "postSmall", types = {Post.class})
public interface PostSmall {
    String getTitle();

    ArrayList<String> getTags();

    ArrayList<String> getCategories();

    String getIntro();

    Date getDate();
}
