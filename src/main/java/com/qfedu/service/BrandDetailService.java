package com.qfedu.service;

import com.qfedu.domain.dto.BrandDetailDto;
import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.ServiceException;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface BrandDetailService {

    /**
     * 增加品牌详情列表
     * @param proId 商品ID
     * @param proName 商品名
     * @param oldPrice 商品老价格
     * @param newPrice 商品新价格
     * @param release_time 发布时间
     * @param examine 审核结果
     * @param status 状态
     * @param brand_id 商品品牌ID
     * @param attribute 商品属性
     * @return 返回影响的行数
     */
    int add(BrandDetailDto brandDetailDto) throws ServiceException;

    /**
     * 批量删除
     * @param ids 要删除的id集合
     * @return 影响的行数
     */
    int deleteBath(List<Integer> ids) throws ServiceException;

    /**
     * 删除商品
     * @param proId 商品id
     * @return 影响的行数
     */
    int deleteById(int proId) throws ServiceException;

    /**
     * 更新商品信息
     * @param proId 商品ID
     * @param oldPrice 老价格
     * @param newPrice 新价格
     * @param releaseTime 发布时间
     * @param examine 审核状态
     * @param status 状态
     * @return 影响的行数
     */
    int updateBrandDetail(int proId, BrandDetailDto brandDetailDto) throws ServiceException;

    /**
     * 封禁商品
     * @param proId 商品id
     * @return
     */
    int updateBannedById(int proId) throws ServiceException;

    /**
     * 显示品牌下所有商品信息
     * @param id 品牌id
     * @return 查询的结果集
     */
    List<BrandDetail> selectAllById(int id, int page, int size) throws ServiceException;

    /**
     * 根据商品id查询信息
     * @param proId 商品id
     * @return 查询到的对象
     */
    BrandDetail selectById(int proId) throws ServiceException;
}
