package com.elasticsearch.demo.module.student.repository;

import com.elasticsearch.demo.module.student.entity.StudentDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * StudentDoc文档的持久层接口
 */
@Repository
public interface StudentElactisSearchRepository extends ElasticsearchRepository<StudentDoc,String>, CrudRepository<StudentDoc,String> {

    /**
     * 通过姓名查找学生信息
     *  注：该查询默认只查找10条数据，不建议采用。
     * @param name
     * @return
     */
    List<StudentDoc> findStudentDocByXm(String name);

}
