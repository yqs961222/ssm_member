package com.qfedu.service;

import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.ServiceException;

import java.util.List;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-14 14:47
 */
public interface BrandDetailService {

    /**
     * 通过指定的属性attr查询商品信息
     *
     * @param attr 指定的属性
     * @return 返回查找到的商品信息集合
     */
    List<BrandDetail> selectByAttr(String attr) throws ServiceException;


}
