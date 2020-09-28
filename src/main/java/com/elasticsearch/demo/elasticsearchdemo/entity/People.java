package com.elasticsearch.demo.elasticsearchdemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "people",type = "man")
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
}
