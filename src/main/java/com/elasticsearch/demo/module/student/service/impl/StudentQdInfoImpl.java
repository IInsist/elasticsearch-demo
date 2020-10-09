package com.elasticsearch.demo.module.student.service.impl;

import com.elasticsearch.demo.module.student.entity.StudentDoc;
import com.elasticsearch.demo.module.student.entity.StudentQdInfo;
import com.elasticsearch.demo.module.student.repository.StudentElactisSearchRepository;
import com.elasticsearch.demo.module.student.repository.StudentQdInfoRepository;
import com.elasticsearch.demo.module.student.service.StudentQdInfoServiceI;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 1、基于ElasticsearchTemplate对ES中student信息进行操作
     */
    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;

    /**
     * 2、基于继承对ElasticsearchRepository的student信息进行操作
     */
    @Resource
    private StudentElactisSearchRepository studentElactisSearchRepository;

    /**
     * 姓名模糊查询
     * POST请求：http://127.0.0.1:9200/student/000000001/_search/
     * 类似于构建成该查询JSON：
     * {
     *     "query": {
     *         "bool": {
     *             "filter": [
     *                 {
     *                     "term": {
     *                         "xm": "周"
     *                     }
     *                 }
     *             ]
     *         }
     *     }
     * }
     * @param name
     * @return
     */
    @Override
    public List<StudentDoc> findStudentInfoByName(String name) {
        /**
         * 1）构造查询体 query和bool
         */
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        /**
         * 2）构造查询条件 filter
         */
        List<QueryBuilder> filter = boolQueryBuilder.filter();

        /**
         * 3）将具体查询条件添加至具体的“查询体”中 term
         *  模糊查找姓名
         */
        filter.add(QueryBuilders.termQuery("xm",name));

        Iterable<StudentDoc> search = studentElactisSearchRepository.search(boolQueryBuilder);
        return Lists.newArrayList(search);
    }

}
