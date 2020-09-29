package com.elasticsearch.demo.elasticsearchdemo;

import com.elasticsearch.demo.elasticsearchdemo.entity.People;
import com.elasticsearch.demo.elasticsearchdemo.service.PeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsTemplateTest {

    @Resource
    private ElasticsearchTemplate estemplate;

    @Autowired
    private PeopleService peopleService;

    @Test
    public void test1(){
        Map mapping = estemplate.getMapping("people", "man");
        System.out.println(mapping.toString());
    }

    /**
     * 查看所有people文档数据
     */
    @Test
    public void test2(){
        List<People> all = peopleService.findAll();
        System.out.println(all.toString());
    }

}
