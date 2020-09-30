package com.elasticsearch.demo.module.study.repository;

import com.elasticsearch.demo.module.study.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * Book文档DAO层
 * 第一种操作ES服务方法：
 *      通过继承org.springframework.data.elasticsearch.repository.ElasticsearchRepository类。
 * 主要用于对数据新增、基本查询
 */
@Repository
public interface BookRepository extends ElasticsearchRepository<Book,String> {

}
