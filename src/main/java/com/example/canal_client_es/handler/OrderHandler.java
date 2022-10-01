package com.example.canal_client_es.handler;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.canal_client_es.entity.Order;
import com.example.canal_client_es.entity.Product;
import com.example.canal_client_es.entity.User;
import com.example.canal_client_es.po.OrderPO;
import com.example.canal_client_es.service.IProductService;
import com.example.canal_client_es.service.IUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

import java.util.List;

/**
 * @author benjamin_5
 * @Description
 * @date 2022/10/1
 */
@CanalTable("my_order")
@Component
@AllArgsConstructor
@Slf4j
public class OrderHandler implements EntryHandler<OrderPO> {

    private final ElasticsearchRestTemplate elasticsearchRestTemplate;

    private final IProductService productService;

    private final IUserService userService;

    @Override
    public void insert(OrderPO orderPO) {
        Order order = new Order();
        BeanUtils.copyProperties(orderPO,order);
        List<Product> productList = productService.list(Wrappers.<Product>lambdaQuery().eq(Product::getSeqNo, order.getSeqNo()));
        order.setProductList(productList);
        List<User> userList = userService.list(Wrappers.<User>lambdaQuery().eq(User::getSeqNo, order.getSeqNo()));
        order.setUserList(userList);
        elasticsearchRestTemplate.save(order);
    }

    @Override
    public void update(OrderPO before, OrderPO after) {
        Order order = new Order();
        BeanUtils.copyProperties(after,order);
        List<Product> productList = productService.list(Wrappers.<Product>lambdaQuery().eq(Product::getSeqNo, order.getSeqNo()));
        order.setProductList(productList);
        List<User> userList = userService.list(Wrappers.<User>lambdaQuery().eq(User::getSeqNo, order.getSeqNo()));
        order.setUserList(userList);
        elasticsearchRestTemplate.save(order);
    }

    @Override
    public void delete(OrderPO orderPO) {
        elasticsearchRestTemplate.delete(orderPO.getId().toString(),Order.class);
    }
}
