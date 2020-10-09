# elasticsearch-demo
一、SpringBoot集成Elasticsearch项目:<br>
SpringBoot版本：2.0.1.RELEASE<br>
Elasticsearch版本：5.2.2<br>
<br>
二、通过继承ElasticsearchRepository操作ES服务<br>
1、创建索引下类型对应的文档类：com.elasticsearch.demo.module.study.entity.Book <br>
2、创建操作ES持久层接口，同时继承org.springframework.data.elasticsearch.repository.ElasticsearchRepository <br>
&nbsp;&nbsp;&nbsp;&nbsp;例如：com.elasticsearch.demo.module.study.repository.BookRepository <br>
3、控制层引用接口：com.elasticsearch.demo.module.study.controller.BookController <br>
4、新增文档测试地址：http://127.0.0.1:8082/book/save<br>
<br>
三、通过ElasticsearchTemplate操作ES服务（对ElasticsearchRepository的补充）<br>
1、创建索引下类型的结文档同上。<br>
2、在服务器层自动装配：org.springframework.data.elasticsearch.core.ElasticsearchTemplate <br>
&nbsp;&nbsp;&nbsp;&nbsp;例如：com.elasticsearch.demo.module.study.service.impl.PeopleServiceImpl <br>
3、控制层引用接口：com.elasticsearch.demo.module.study.controller.PeopleController <br>
4、新增people文档测试案例：com.elasticsearch.demo.study.PeopleTest <br>
<br>
四、参考spring-boot-starter-data-elasticsearch文档：<br>
https://docs.spring.io/spring-data/elasticsearch/docs/3.1.20.RELEASE/reference/html/<br>
https://github.com/spring-projects/spring-data-elasticsearch<br>
<br>
