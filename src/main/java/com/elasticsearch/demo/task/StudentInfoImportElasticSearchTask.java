package com.elasticsearch.demo.task;

import com.elasticsearch.demo.module.student.service.StudentQdInfoServiceI;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author fujh
 * 定时调度学生信息进入到ES仓库中
 */
@Component
public class StudentInfoImportElasticSearchTask {

    @Resource
    private StudentQdInfoServiceI studentInfoService;

    /**
     * 使用@Scheduled注解创建调度任务
     */
    //@Scheduled(cron = "1/5 * * * * ?")
    public void schedule(){
        System.out.println("使用@Scheduled创建任务调度。。。。。");
    }

}
