package com.yanjd.blog.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document("blog_v2_category")
public class Category {
    ObjectId id;
    String name; // 名称
    String alias; // 别名（挂载url）
    String color; // 颜色
    int num; // 数量
}
