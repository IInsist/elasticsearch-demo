package com.elasticsearch.demo.student;

import com.elasticsearch.demo.module.student.entity.StudentDoc;
import com.elasticsearch.demo.module.student.entity.StudentQdInfo;
import com.elasticsearch.demo.module.student.repository.StudentElactisSearchRepository;
import com.elasticsearch.demo.module.student.service.StudentQdInfoServiceI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentInfoTest {

    @Resource
    private StudentQdInfoServiceI studentService;

    @Resource
    private StudentElactisSearchRepository repository;

    /**
     * 将RDBMS数据导入至ES数据仓库中
     */
    @Test
    public void importEs(){
        //QueryWrapper<StudentQdInfo> query = new QueryWrapper<StudentQdInfo>();
        //query.eq("XM","李某某");
        List<StudentQdInfo> allStudentInfo = studentService.list();
        List<StudentDoc> allStudentDoc = new ArrayList<>();
        int i = 0;
        System.out.println("开始导入。。。。。。。。。。。。。。。。。。。。。。");
        for (StudentQdInfo obj:allStudentInfo){
            StudentDoc s = new StudentDoc();
            s.setXh(obj.getXh());
            s.setXm(obj.getXm());
            s.setBj(obj.getBj());
            s.setBzr(obj.getBzr());
            s.setBj(obj.getBj());
            s.setZy(obj.getZy());
            s.setLxdh(obj.getLxdh());
            s.setNj(obj.getNj());
            s.setSfz(obj.getSfz());
            s.setCjsj(obj.getCjsj());
            s.setGxsj(obj.getGxsj());
            s.setXx(obj.getXx());
            s.setXy(obj.getXy());
            allStudentDoc.add(s);
            repository.save(s);
            i++;
            System.out.println("序号："+i+"，导入成功："+s.getXm());
        }
        System.out.println("----------------------导入成功，成功数量："+i+"----------------------------");
    }

    /**
     * 删除全部学生数据
     */
    @Test
    public void deleteAll(){
        repository.deleteAll();
    }

    /**
     * 条件查询学生姓名
     */
    @Test
    public void findStudentInfoByName(){
        List<StudentDoc> result = studentService.findStudentInfoByName("周");
        int i=1;
        for (StudentDoc s:result){
            System.out.println("i="+i+" "+s.toString());
            i++;
        }
    }

    /**
     * 查找某学院下学生信息
     */
    @Test
    public void findStudentInfoByXy(){
        List<StudentDoc> result = studentService.findStudentInfoByXy("艺术与设计学院");
        Integer i=1;
        for (StudentDoc s:result){
            System.out.println("i="+i+" "+s.toString());
            i++;
        }
    }

    /**
     * 通过姓名分页查找学生信息
     */
    @Test
    public void findStudentInfoByPage(){
        Pageable page = PageRequest.of(1,50);
        Page<StudentDoc> result = studentService.findStudentInfoByPage("周", page);
        System.out.println("toString（）："+result.toString());
        System.out.println("总数量："+result.getTotalElements());
        System.out.println("总数量："+result.getSize());
        System.out.println("总页数："+result.getTotalPages());
        System.out.println("Pageable对象toString（）："+result.getPageable().toString());
        System.out.println("总切片数："+result.getNumber());

        int i=1;
        for (StudentDoc s:result.getContent()){
            System.out.println("i="+i+" "+s.toString());
            i++;
        }
    }

    /**
     * 通过姓名分页查找学生信息
     */
    @Test
    public void groupByXy(){
        AggregatedPage resutl = (AggregatedPage)studentService.groupByXy();
        System.out.println(resutl.toString());
        System.out.println(resutl.getAggregation("xy").toString());
        System.out.println(resutl.getAggregations().toString());
    }

}
