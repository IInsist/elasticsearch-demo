package com.elasticsearch.demo.elasticsearchdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsTemplateTest {

    @Resource
    private ElasticsearchTemplate estemplate;

    @Test
    public void test1(){
        Map mapping = estemplate.getMapping("people", "man");
        System.out.println(mapping.toString());
    }

}
