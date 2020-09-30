package com.elasticsearch.demo.module.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Document 设置文档存储的索引、类型
 */
@Document(indexName = "book",type = "kehuan")
@Data
@AllArgsConstructor
public class Book implements Serializable {

    @Id
    private String id;

    @Field(type = FieldType.text)
    private String name;

    @Field(type = FieldType.text)
    private String title;

    @Field(type = FieldType.Integer)
    private int page;

    @DateTimeFormat(pattern="yyyy-MM-ddHH:mm:ss")
    @Field(type = FieldType.Date)
    private Date date;

    /**
     * 需要添加无参数的构造函数
     */
    public Book() {
    }

    public Book(String name, String title, int page, Date date) {
        this.name = name;
        this.title = title;
        this.page = page;
        this.date = date;
    }
}
