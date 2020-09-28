package com.elasticsearch.demo.elasticsearchdemo;

import com.elasticsearch.demo.elasticsearchdemo.entity.Book;
import com.elasticsearch.demo.elasticsearchdemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
public class EsTest {

    @Autowired
    private BookRepository bookRepository;

    public void test1(){
//        String name, String title, int page, Date date
        Book book = new Book("小瓜瓜","这是一个小瓜瓜",1111,new Date());
        bookRepository.save(book);
    }

}
