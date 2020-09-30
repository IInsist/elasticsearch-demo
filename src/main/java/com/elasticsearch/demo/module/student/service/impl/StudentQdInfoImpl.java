package com.elasticsearch.demo.module.student.service.impl;

import com.elasticsearch.demo.module.student.entity.StudentQdInfo;
import com.elasticsearch.demo.module.student.repository.StudentQdInfoRepository;
import com.elasticsearch.demo.module.student.service.StudentQdInfoServiceI;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fujh
 * @since 2020-09-30
 */
@Service
public class StudentQdInfoImpl extends ServiceImpl<StudentQdInfoRepository, StudentQdInfo> implements StudentQdInfoServiceI {

}
