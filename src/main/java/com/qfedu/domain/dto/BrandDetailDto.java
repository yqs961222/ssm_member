package com.qfedu.domain.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-15 11:27
 */
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
     * 商品的审核状态, 1 通过, 0 不通过
     */
    private Integer examine;

    /**
     * 状态, 1 启用, 0 禁用, 3 假删除
     */
    private Integer status;
}
