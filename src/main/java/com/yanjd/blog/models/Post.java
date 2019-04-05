package com.yanjd.blog.models;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "blog_v1_post", schema = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    String content;
    String intro;
    String markdown;
    Date date;
    @ManyToMany
    @JoinTable(name = "blog_v1_rel_tag_post",
            joinColumns = @JoinColumn(name = "post_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id", nullable = false))
    Set<Tag> tags = new HashSet<>();
    String tagIds;
}
