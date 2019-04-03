package com.yanjd.blog.models.projection;

import com.yanjd.blog.models.Post;
import com.yanjd.blog.models.Tag;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

@Projection(name = "postSmall", types = {Post.class})
public interface PostSmall {
    String getTitle();

//    Set<Tag> getTags();
    String getTagIds();

    String getIntro();

    Date getDate();
}
