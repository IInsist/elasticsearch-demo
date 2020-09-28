# elasticsearch-demo
一、SpringBoot集成Elasticsearch项目:<br>
SpringBoot版本：2.0.1.RELEASE<br>
Elasticsearch版本：5.2.2
<br><br>
二、开发顺序<br>
1、创建索引下类型对应的文档类：com.elasticsearch.demo.elasticsearchdemo.entity.Book <br>
2、创建操作ES持久层接口，同时继承org.springframework.data.elasticsearch.repository.ElasticsearchRepository <br>
&nbsp;&nbsp;&nbsp;&nbsp;例如：com.elasticsearch.demo.elasticsearchdemo.repository.BookRepository <br>
3、控制层引用接口：com.elasticsearch.demo.elasticsearchdemo.controller.BookController <br>
4、新增文档测试地址：http://127.0.0.1:9200/book/save<br>
<br><br>
三、参考spring-boot-starter-data-elasticsearch文档：<br>
https://docs.spring.io/spring-data/elasticsearch/docs/3.1.20.RELEASE/reference/html/

