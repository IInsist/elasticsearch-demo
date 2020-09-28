package com.elasticsearch.demo.elasticsearchdemo.repository;

import com.elasticsearch.demo.elasticsearchdemo.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book,String> {

}
