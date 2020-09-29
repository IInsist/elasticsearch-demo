package com.elasticsearch.demo.elasticsearchdemo.service;

import com.elasticsearch.demo.elasticsearchdemo.entity.People;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PeopleService {
    /**
     * 查找全部People文档
     * @return
     */
    List<People> findAll();
}
