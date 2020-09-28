package com.elasticsearch.demo.elasticsearchdemo.service.impl;

import com.elasticsearch.demo.elasticsearchdemo.entity.People;
import com.elasticsearch.demo.elasticsearchdemo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;


import java.util.List;

/**
 * 第二种操作ES服务的方法：
 *     自动装配 org.springframework.data.elasticsearch.core.ElasticsearchTemplate 进行操作ES服务
 */
public class PeopleServiceImpl implements PeopleService<People> {

    @Autowired
    private ElasticsearchTemplate template;


    @Override
    public List<People> findAll() {
        return null;
    }
}
