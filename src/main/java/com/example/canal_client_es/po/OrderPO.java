package com.example.canal_client_es.po;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author benjamin_5
 * @Description
 * @date 2022/10/1
 */
@Data
@Table(name = "my_order")
public class OrderPO implements Serializable {

    /**
     * 主键
     */
    @Column(name = "id")
    private Long id;

    /**
     * 订单号
     */
    @Column(name = "seq_no")
    private String seqNo;

    /**
     * 总价
     */
    @Column(name = "total_price")
    private BigDecimal totalPrice;

    /**
     * 数量
     */
    @Column(name = "quantity")
    private Integer quantity;

}
