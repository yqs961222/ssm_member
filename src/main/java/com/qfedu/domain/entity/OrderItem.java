package com.qfedu.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author FUTURE
 */
@Data
public class OrderItem implements Serializable {
    /**
    * 订单详情id
    */
    private Integer id;

    /**
    * 订单号
    */
    private Integer orderNo;

    /**
    * 商品名
    */
    private String productName;

    /**
    * 商品图片
    */
    private String productPic;

    /**
    * 商品价格
    */
    private BigDecimal productPrice;

    /**
    * 商品数量
    */
    private Integer productQuantity;

    /**
    * 商品描述
    */
    private String productDes;

    /**
    * 会员id
    */
    private Integer memberId;
}