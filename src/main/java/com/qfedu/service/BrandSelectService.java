package com.qfedu.service;

import com.qfedu.domain.dto.BrandDto;
import com.qfedu.domain.entity.Brand;
import com.qfedu.exception.ServiceException;

import java.util.List;

/**
 * @author FUTURE
 */
public interface BrandSelectService {
    /**
     * 根据商品名和上架时间查询
     *
     * @param brandDto
     * @return
     */
    List<Brand> selectBrand(BrandDto brandDto) throws ServiceException;

    /**
     * 通过商品id,国家,品牌查询---精确查询
     *
     * @param brandDto
     * @return
     */
    Brand selectBrandById(BrandDto brandDto) throws ServiceException;

    /**
     * 添加商品
     *
     * @param brandDto
     * @return
     */
    int insertBrand(BrandDto brandDto) throws ServiceException;

    /**
     * 分页查询数据
     *
     * @return
     */
    List<Brand> selectAll(int limit, int offset) throws ServiceException;

    /**
     * 批量删除
     *
     * @param id
     * @return
     */
    int update(List<Integer> id) throws ServiceException;

    /**
     * 根据国家查询商品信息
     * @param country
     * @return
     */
    List<Brand> selectByCountry(String country) throws ServiceException;
}
