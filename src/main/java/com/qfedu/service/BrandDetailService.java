package com.qfedu.service;

import com.qfedu.domain.dto.BrandDetailDto;
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
     * Jesse
     * 通过指定的属性attr查询商品信息
     */
    List<BrandDetail> selectByAttr(String attr) throws ServiceException;

    /**
     * Jesse
     * 通过search模糊值, 查找到对应的对象集合
     */
    List<BrandDetail> selectBySearch(String search) throws ServiceException;

    /**
     * Jesse
     * 查询所有属性
     */
    List<String> selectForAttr() throws ServiceException;

    /**
     * Jesse
     * 通过点击商品名称, 查询商品详情表
     * @return
     */
    ProDetailDto selectByProId(Integer proId) throws ServiceException;

    /**
     * XTL
     * 添加商品
     */
    int add(BrandDetailDto brandDetailDto) throws ServiceException;

    /**
     * XTL
     * 批量删除商品
     */
    int deleteBath(List<Integer> ids) throws ServiceException;

    /**
     * XTL
     * 通过商品ID删除商品
     */
    int deleteById(int proId) throws ServiceException;

    /**
     * XTL
     * 修改单条商品详细信息
     */
    int updateBrandDetail(int proId, BrandDetailDto brandDetailDto) throws ServiceException;

    /**
     * XTL
     * 通过商品ID禁用或启用商品的状态
     */
    int updateBannedById(int proId) throws ServiceException;

    /**
     * XTL
     * 分页查询展示
     */
    List<BrandDetail> selectAllById(int id, int page, int size) throws ServiceException;

    /**
     * XTL
     * 工具方法, 通过商品ID查询到对应的商品信息
     */
    BrandDetail selectById(int proId) throws ServiceException;
}
