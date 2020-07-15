package com.qfedu.domain.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class ProductOrder implements Serializable {
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
    private Integer total;

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