package com.example.canal_client_es.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.canal_client_es.entity.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author benjamin_5
 * @Description
 * @date 2022/10/1
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
