package com.example.canal_client_es.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author benjamin_5
 * @Description 收货人
 * @date 2022/10/1
 */
@Data
@Table(name = "user")
public class User implements Serializable {

    @Field(type = FieldType.Long, name="id")
    private Long id;

    @Field(type = FieldType.Keyword, name="seqNo")
    @Column(name = "seq_no")
    private String seqNo;

    @Field(type = FieldType.Keyword, name="name")
    private String name;

    @Field(type = FieldType.Integer, name="age")
    private Integer age;

    @Field(type = FieldType.Text, name="address", analyzer = "ik_smart")
    private String address;
}
