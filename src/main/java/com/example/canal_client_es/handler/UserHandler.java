package com.example.canal_client_es.handler;

import com.example.canal_client_es.entity.User;
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
@CanalTable("user")
@Component
@AllArgsConstructor
@Slf4j
public class UserHandler implements EntryHandler<User> {

    private final ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Override
    public void insert(User user) {
        EntryHandler.super.insert(user);
    }

    @Override
    public void update(User before, User after) {
        EntryHandler.super.update(before, after);
    }

    @Override
    public void delete(User user) {
        EntryHandler.super.delete(user);
    }
}
