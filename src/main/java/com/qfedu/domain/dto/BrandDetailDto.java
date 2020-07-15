package com.qfedu.domain.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class BrandDetailDto {
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
     * 品牌id
     */
    private Integer brandId;

    /**
     * 商品属性
     */
    private String attribute;

}
