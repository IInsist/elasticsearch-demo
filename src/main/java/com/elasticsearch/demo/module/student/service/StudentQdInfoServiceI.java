package com.elasticsearch.demo.module.student.service;

import com.elasticsearch.demo.module.student.entity.StudentDoc;
import com.elasticsearch.demo.module.student.entity.StudentQdInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fujh
 * @since 2020-09-30
 */
public interface StudentQdInfoServiceI extends IService<StudentQdInfo> {

    /**
     * 姓名模糊查询
     * @param name
     * @return
     */
    List<StudentDoc> findStudentInfoByName(String name);
}
