package com.elasticsearch.demo.elasticsearchdemo;

import com.elasticsearch.demo.elasticsearchdemo.entity.Book;
import com.elasticsearch.demo.elasticsearchdemo.repository.BookRepository;
import com.elasticsearch.demo.elasticsearchdemo.util.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsTest {

    @Autowired
    private BookRepository bookRepository;

    /**
     * ES新增文档案例
     */
    @Test
    public void test1(){
        Book book = new Book("小美眉","这是一个小瓜瓜",1111,new Date());
        bookRepository.save(book);
    }

}
