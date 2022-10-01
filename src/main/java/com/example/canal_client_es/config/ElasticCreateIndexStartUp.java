package com.example.canal_client_es.config;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.IndexOperations;

import java.util.Set;

/**
 * @author benjamin_5
 * @Description 根据实体自动创建es索引
 * @date 2022/10/1
 */
@Configuration
@Slf4j
@AllArgsConstructor
public class ElasticCreateIndexStartUp implements ApplicationListener<ContextRefreshedEvent> {

    private final ElasticsearchRestTemplate restTemplate;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){
        log.info("[elastic]索引初始化...");
        Reflections f = new Reflections("com.example.canal_client_es.entity");
        Set<Class<?>> classSet = f.getTypesAnnotatedWith(Document.class);
        for (Class<?> clazz : classSet) {
            IndexOperations indexOperations = restTemplate.indexOps(clazz);
            if(!indexOperations.exists()){
                indexOperations.create();
                indexOperations.putMapping();
                log.info(String.format("[elastic]索引%s数据结构创建成功",clazz.getSimpleName()));
            }
        }
        log.info("[elastic]索引初始化完毕");
    }
}
