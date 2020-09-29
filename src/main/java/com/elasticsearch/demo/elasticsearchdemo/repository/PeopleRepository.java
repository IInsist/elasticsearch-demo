package com.elasticsearch.demo.elasticsearchdemo.repository;

import com.elasticsearch.demo.elasticsearchdemo.entity.People;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * People文档DAO层
 * 第一种操作ES服务的方法：
 *      通过继承org.springframework.data.elasticsearch.repository.ElasticsearchRepository类。
 * 主要用于对数据新增、基本查询
 */
@Repository
public interface PeopleRepository extends ElasticsearchRepository<People,String> {

}
