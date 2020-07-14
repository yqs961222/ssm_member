package com.qfedu.service;

import com.qfedu.domain.entity.Brand;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-13 14:22
 */
public interface BrandService {

    /**
     * 修改传入的品牌信息
     *
     * @param brand 传入的品牌
     * @return 返回影响的行数
     */
    int updateByBrand(int id, Brand brand);
}
