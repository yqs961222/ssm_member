package com.qfedu.service;

import com.qfedu.domain.dto.BrandDto;
import com.qfedu.domain.entity.Brand;

import java.util.List;

public interface BrandSelectService {
    /**
     * 根据商品名和上架时间查询
     *
     * @param brandDto
     * @return
     */
    List<Brand> selectBrand(BrandDto brandDto);

    /**
     * 通过商品id,国家,品牌查询---精确查询
     *
     * @param brandDto
     * @return
     */
    Brand selectBrandById(BrandDto brandDto);

    /**
     * 添加商品
     *
     * @param brandDto
     * @return
     */
    int insertBrand(BrandDto brandDto);

    /**
     * 分页查询数据
     *
     * @return
     */
    List<Brand> selectAll(int limit, int offset);

    /**
     * 批量删除
     *
     * @param id
     * @return
     */
    int update(List<Integer> id);

    /**
     * 根据国家查询商品信息
     * @param country
     * @return
     */
    List<Brand> selectByCountry(String country);
}
