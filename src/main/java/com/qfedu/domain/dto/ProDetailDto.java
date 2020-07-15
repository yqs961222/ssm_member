package com.qfedu.domain.dto;

import com.qfedu.domain.entity.BrandDetail;
import lombok.Data;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-15 19:45
 */
@Data
public class ProDetailDto {
    /**
     * 商品详情id
     */
    private Integer id;

    /**
     * 商品的说明, 包括各种配置, 外形, 性能等
     */
    private String proDescription;

    /**
     * 产品编号
     */
    private Integer proId;

    /**
     * 品牌详情表
     */
    private BrandDetail brandDetail;

    @Override
    public String toString() {
        return "ProDetailDto{" +
                "id=" + id +
                ", proDescription='" + proDescription + '\'' +
                ", proId=" + proId +
                ", brandDetail=" + brandDetail +
                '}';
    }
}
