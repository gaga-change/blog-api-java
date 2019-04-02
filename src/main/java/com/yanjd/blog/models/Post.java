package com.yanjd.blog.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "blog_post", schema = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    String content;
    String intro;
    String markdown;
    Date date;
    @ManyToMany(cascade = CascadeType.PERSIST, fetch=FetchType.LAZY)
    @JoinTable(name="post_tag",joinColumns={@JoinColumn(name="post_id")},inverseJoinColumns={@JoinColumn(name="tag_id")})
    Set<Tag> tags;
}
