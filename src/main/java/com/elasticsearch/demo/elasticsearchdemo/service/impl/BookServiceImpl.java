package com.elasticsearch.demo.elasticsearchdemo.service.impl;

import com.elasticsearch.demo.elasticsearchdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 第二种操作ES服务的方法：
 *     自动装配 org.springframework.data.elasticsearch.core.ElasticsearchTemplate 进行操作ES服务
 * 主要用于一系列复杂条件查询
 */
@Service
public class BookServiceImpl implements BookService {

    /**
     * 主要用于一系列复杂条件查询。
     */
    @Autowired
    private ElasticsearchTemplate template;

    /**
     * 主要用于对数据的新增、基本查询等。
     */
    @Resource
    private BookService bookService;

}
