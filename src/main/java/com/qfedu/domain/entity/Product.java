package com.qfedu.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;


import lombok.Data;

/**
 * @author FUTURE
 */
@Data
public class Product implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 商品id
    */
    private Integer productId;

    /**
    * 商品名
    */
    private String productName;

    /**
    * 商品旧价格
    */
    private BigDecimal oldPrice;

    /**
    * 商品新价格
    */
    private BigDecimal newPrice;

    /**
    * 库存
    */
    private Integer productStock;

    /**
    * 商品图片
    */
    private String productImg;
    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 商品描述
     */
    private String productDes;

    /**
     * 商品属性
     */
    private String productAtt;
}