package com.qfedu.service;

import com.qfedu.domain.dto.ProDetailDto;
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
     */
    List<BrandDetail> selectByAttr(String attr) throws ServiceException;

    /**
     * 通过search模糊值, 查找到对应的对象集合
     */
    List<BrandDetail> selectBySearch(String search) throws ServiceException;

    /**
     * 查询所有属性
     */
    List<String> selectForAttr() throws ServiceException;

    /**
     * 通过点击商品名称, 查询商品详情表
     * @return
     */
    ProDetailDto selectByProId(Integer proId) throws ServiceException;

}
