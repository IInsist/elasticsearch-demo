package com.elasticsearch.demo.module.study.controller;

import com.elasticsearch.demo.module.study.entity.Book;
import com.elasticsearch.demo.module.study.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    BookRepository bookRepository;

    @GetMapping("/save")
    public void save(){
        //Book book = new Book("小瓜瓜","这是一个小瓜瓜",1111,new Date());
        Book book = new Book("布吉岛","布吉岛",122,new Date());
        Book save = bookRepository.save(book);
        System.out.println(book.toString());
    }

}
