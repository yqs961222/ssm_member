package com.qfedu.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class BrandDetail {
    /**
     * 商品id
     */
    private Integer proId;

    /**
     * 商品名称
     */
    private String proName;

    /**
     * 商品原价
     */
    private BigDecimal oldPrice;

    /**
     * 商品现价
     */
    private BigDecimal newPrice;

    /**
     * 商品的发布时间
     */
    private String releaseTime;

    /**
     * 商品的审核状态, 1 通过, 0 不通过
     */
    private Integer examine;

    /**
     * 状态, 1 启用, 0 禁用
     */
    private Integer status;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 商品属性
     */
    private String attribute;
}

