package com.yanjd.blog.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "blog_v1_tag", schema = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name; // 名称
    String alias; // 别名（挂载url）
    String color; // 颜色
    int num; // 数量
    @ManyToMany(mappedBy = "tags")
    private List<Post> posts = new ArrayList<>();
}
