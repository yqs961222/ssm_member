package com.qfedu.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author FUTURE
 */
@Data
public class Order implements Serializable {
    /**
    * 订单编号
    */
    private Integer orderId;

    /**
    * 订单号
    */
    private Integer orderNo;

    /**
    * 总价
    */
    private BigDecimal total;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 0表示已付款
    */
    private Integer status;

    /**
    * 会员id
    */
    private Integer memberId;
}