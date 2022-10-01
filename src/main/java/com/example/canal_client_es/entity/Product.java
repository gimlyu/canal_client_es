package com.example.canal_client_es.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author benjamin_5
 * @Description 商品
 * @date 2022/10/1
 */
@Data
@Table(name = "product")
public class Product implements Serializable {

    @Field(type = FieldType.Long, name="id")
    private Long id;

    @Field(type = FieldType.Keyword, name="seqNo")
    @Column(name = "seq_no")
    private String seqNo;

    @Field(type = FieldType.Double, name="price")
    private BigDecimal price;

    @Field(type = FieldType.Text, name="name", analyzer = "ik_smart")
    private String name;

}
