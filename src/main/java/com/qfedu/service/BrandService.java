package com.qfedu.service;

import com.qfedu.domain.entity.Brand;
import com.qfedu.exception.ServiceException;

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
     * @throws ServiceException 可能有service层异常
     */
    int updateByBrand(int id, Brand brand) throws ServiceException;

    /**
     * 删除指定ID的品牌信息, 假删除
     * @param id 传入的品牌信息id
     * @return 返回影响的行数
     * @throws ServiceException 可能有service层异常
     */
    int deleteById(int id) throws ServiceException;
}
