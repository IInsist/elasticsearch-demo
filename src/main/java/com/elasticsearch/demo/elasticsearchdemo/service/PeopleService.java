package com.elasticsearch.demo.elasticsearchdemo.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PeopleService<People> {
    List<People> findAll();
}
