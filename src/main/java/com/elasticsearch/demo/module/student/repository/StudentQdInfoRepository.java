package com.elasticsearch.demo.module.student.repository;

import com.elasticsearch.demo.module.student.entity.StudentDoc;
import com.elasticsearch.demo.module.student.entity.StudentQdInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fujh
 * @since 2020-09-30
 */
public interface StudentQdInfoRepository extends BaseMapper<StudentQdInfo>{

}
