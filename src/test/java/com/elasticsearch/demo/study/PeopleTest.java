package com.elasticsearch.demo.study;

import com.elasticsearch.demo.module.study.entity.People;
import com.elasticsearch.demo.module.study.service.PeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PeopleTest {

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
     * 测试查看所有people文档数据
     */
    @Test
    public void test2(){
        List<People> all = peopleService.findAll();
        System.out.println(all.toString());
    }

    /**
     * 测试单个查找
     */
    @Test
    public void test3(){
        People one = peopleService.findById("AXSuOZkYEcJFge0Om38G");
        System.out.println(one.toString());
    }

}
