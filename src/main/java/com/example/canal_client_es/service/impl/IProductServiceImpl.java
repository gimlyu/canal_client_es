package com.example.canal_client_es.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.canal_client_es.entity.Product;
import com.example.canal_client_es.mapper.ProductMapper;
import com.example.canal_client_es.service.IProductService;
import org.springframework.stereotype.Service;

/**
 * @author benjamin_5
 * @Description
 * @date 2022/10/1
 */
@Service
public class IProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {
}
