package com.yanjd.blog.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "blog_tag", schema = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name; // 名称
    String alias; // 别名（挂载url）
    String color; // 颜色
    int num; // 数量
    @ManyToMany(cascade = CascadeType.PERSIST, fetch=FetchType.LAZY)
    @JoinTable(name="post_tag",joinColumns={@JoinColumn(name="tag_id")},inverseJoinColumns={@JoinColumn(name="post_id")})
    Set<Post> posts;
}
