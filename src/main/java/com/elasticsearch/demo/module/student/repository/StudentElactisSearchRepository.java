package com.elasticsearch.demo.module.student.repository;

import com.elasticsearch.demo.module.student.entity.StudentDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * StudentDoc文档的持久层接口
 */
@Repository
public interface StudentElactisSearchRepository extends ElasticsearchRepository<StudentDoc,String> {

}
