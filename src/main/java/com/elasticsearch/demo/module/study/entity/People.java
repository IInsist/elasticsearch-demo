package com.elasticsearch.demo.module.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * man类型文档结构
 */
@Document(indexName = "people",type = "man")
@Data
@AllArgsConstructor
public class People {

    @Id
    private String id;

    @Field(type = FieldType.text)
    private String name;

    @Field(type = FieldType.Integer)
    private int age;

    @Field(type = FieldType.text)
    private String address;

    @Field(type = FieldType.text)
    private String phone;

    /**
     * 需要添加无参数的构造方法
     */
    public People() {
    }

    public People(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

}
