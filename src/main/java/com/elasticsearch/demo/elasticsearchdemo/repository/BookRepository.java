package com.elasticsearch.demo.elasticsearchdemo.repository;

import com.elasticsearch.demo.elasticsearchdemo.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * 第一种操作ES服务方法：
 *      通过继承ElasticsearchRepository类
 */
@Repository
public interface BookRepository extends ElasticsearchRepository<Book,String> {

}
