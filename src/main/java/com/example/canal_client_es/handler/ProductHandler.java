package com.example.canal_client_es.handler;

import com.example.canal_client_es.entity.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

/**
 * @author benjamin_5
 * @Description
 * @date 2022/10/1
 */
@CanalTable("product")
@Component
@AllArgsConstructor
@Slf4j
public class ProductHandler implements EntryHandler<Product> {

    private final ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Override
    public void insert(Product product) {
        // TODO
    }

    @Override
    public void update(Product before, Product after) {
        // TODO
    }

    @Override
    public void delete(Product product) {
        // TODO

    }
}
