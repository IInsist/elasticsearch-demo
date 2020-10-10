package com.elasticsearch.demo.module.student.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fujh
 * @since 2020年9月30日16:11:01
 * 学生信息文档
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Document(indexName = "student",type = "000000001")
public class StudentDoc implements Serializable {

    @Id
    private String id;

    @Field(type = FieldType.text)
    private String xh;

    @Field(type = FieldType.text)
    private String xm;

    @Field(type = FieldType.text)
    private String sfz;

    @Field(type = FieldType.text)
    private String lxdh;

    /**
     * 开启fielddata=true后支持对text类型字段进行aggs聚合查询
     */
    @Field(type = FieldType.text,fielddata = true)
    private String nj;

    @Field(type = FieldType.text)
    private String bj;

    /**
     * 开启fielddata=true后支持对text类型字段进行aggs聚合查询
     */
    @Field(type = FieldType.text,fielddata = true)
    private String zy;

    @Field(type = FieldType.text)
    private String bzr;

    @Field(type = FieldType.Date)
    private Date cjsj;

    @Field(type = FieldType.Date)
    private Date gxsj;

    /**
     * 开启fielddata=true后支持对text类型字段进行aggs聚合查询
     */
    @Field(type = FieldType.text,fielddata = true)
    private String xy;

    @Field(type = FieldType.text)
    private String xx;

    /**
     * 必须保留空构造
     */
    public StudentDoc() {

    }

}
