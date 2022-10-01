package com.example.canal_client_es.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author benjamin_5
 * @Description 订单实体
 * @date 2022/10/1
 */
@Data
@Document(indexName = "my_order")
@Setting(replicas = 0, shards = 1)
public class Order implements Serializable {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 订单号
     */
    @Field(type = FieldType.Keyword, name="seqNo")
    private String seqNo;

    /**
     * 总价
     */
    @Field(type = FieldType.Double, name="totalPrice")
    private BigDecimal totalPrice;

    /**
     * 数量
     */
    @Field(type = FieldType.Integer, name="quantity")
    private Integer quantity;

    /**
     * 商品清单
     */
    @Field(type = FieldType.Nested, name="productList")
    private List<Product> productList;

    /**
     * 收货人清单
     */
    @Field(type = FieldType.Nested, name="userList")
    private List<User> userList;


}
