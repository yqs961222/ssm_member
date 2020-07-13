package com.qfedu.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * 品牌管理表
 */
@Data
public class Brand {
    /**
     * 品牌ID
     */
    private Integer id;

    /**
     * 品牌logo
     */
    private String brandLogo;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 国家地区
     */
    private String country;

    /**
     * 品牌描述
     */
    private String description;

    /**
     * 品牌加入商城的时间
     */
    private String joinTime;

    /**
     * 状态码, 1 启用, 0 禁用
     */
    private Integer status;


}