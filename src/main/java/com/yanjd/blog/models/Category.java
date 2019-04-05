package com.yanjd.blog.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "blog_v1_category", schema = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name; // 名称
    String alias; // 别名（挂载url）
    String color; // 颜色
    int num; // 数量
}
