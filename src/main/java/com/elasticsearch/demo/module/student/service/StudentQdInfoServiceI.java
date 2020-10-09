package com.elasticsearch.demo.module.student.service;

import com.elasticsearch.demo.module.student.entity.StudentDoc;
import com.elasticsearch.demo.module.student.entity.StudentQdInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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

    /**
     * 查找某学院下学生信息
     * @param xy
     * @return
     */
    List<StudentDoc> findStudentInfoByXy(String xy);

    /**
     * 通过姓名分页查找学生信息
     * @param name
     * @param page
     * @return
     */
    Page<StudentDoc> findStudentInfoByPage(String name, Pageable page);

}
