package com.elasticsearch.demo.elasticsearchdemo.repository;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.repository.support.AbstractElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.support.ElasticsearchEntityInformation;

public class People extends AbstractElasticsearchRepository<People,String> {

    public People(ElasticsearchEntityInformation<People, String> metadata, ElasticsearchOperations operations) {
        super(metadata, operations);
    }

    @Override
    protected String stringIdRepresentation(String s) {
        return s;
    }

}
