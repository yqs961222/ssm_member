package com.qfedu.domain.entity;

import lombok.Data;

    /**
    * 商品详情表
    */
@Data
public class ProDetail {
    /**
    * 商品详情id
    */
    private Integer id;

    /**
    * 商品名称
    */
    private String proName;

    /**
    * 商品的说明, 包括各种配置, 外形, 性能等
    */
    private String proDescription;

    /**
    * 产品编号
    */
    private Integer proId;
}