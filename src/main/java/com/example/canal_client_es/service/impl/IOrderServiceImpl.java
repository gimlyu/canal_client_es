package com.example.canal_client_es.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.canal_client_es.mapper.OrderMapper;
import com.example.canal_client_es.po.OrderPO;
import com.example.canal_client_es.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @author benjamin_5
 * @Description
 * @date 2022/10/1
 */
@Service
public class IOrderServiceImpl extends ServiceImpl<OrderMapper, OrderPO> implements IOrderService {
}
