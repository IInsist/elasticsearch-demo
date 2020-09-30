package com.elasticsearch.demo.module.study.service.impl;

import com.elasticsearch.demo.module.study.entity.People;
import com.elasticsearch.demo.module.study.repository.PeopleRepository;
import com.elasticsearch.demo.module.study.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * 第二种操作ES服务的方法：
 *     自动装配 org.springframework.data.elasticsearch.core.ElasticsearchTemplate 进行操作ES服务
 * 主要用于一系列复杂条件查询
 */
@Service
public class PeopleServiceImpl implements PeopleService{

    /**
     * 主要用于一系列复杂条件查询。
     */
    @Autowired
    private ElasticsearchTemplate template;

    /**
     * 主要用于对数据的新增、基本查询等。
     */
    @Resource
    private PeopleRepository peopleRepository;

    /**
     * 查找全部People文档
     * @return
     */
    @Override
    public List<People> findAll() {
        Iterable<People> allBook = peopleRepository.findAll();
        Iterator<People> iterator = allBook.iterator();
        List<People> result = new ArrayList<>();
        //查看一下内容
        while (iterator.hasNext()){
            People next = iterator.next();
            System.out.println(next.toString());
            result.add(next);
        }
        return result;
    }

    /**
     * 通过名称进行模糊查询
     * @return
     */
    @Override
    public List<People> findByName() {
        //peopleRepository.find
        return null;
    }

    /**
     * 单个查找
     * @param id
     * @return
     */
    @Override
    public People findById(String id) {
        Optional<People> one = peopleRepository.findById(id);
        return one==null ? null : one.get();
    }

}
