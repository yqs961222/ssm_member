package com.qfedu.mapper;

import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.DaoException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandDetailMapper {

    /**
     * 通过属性查询商品信息
     */
    List<BrandDetail> selectByAttr(@Param("attr") String attr) throws DaoException;

    /**
     * 通过search模糊值, 查找到对应的对象集合
     */
    List<BrandDetail> selectBySearch(@Param("search") String search) throws DaoException;

    /**
     * 查询属性
     */
    List<String> selectForAttr() throws DaoException;


    /**
     * 显示该品牌所有商品
     */
    List<BrandDetail> selectAllById(@Param("id") int id, @Param("page") int page, @Param("size") int size);

    /**
     * 添加品牌
     */
    int insertProduct(@Param("brandDetail") BrandDetail brandDetail) throws DaoException;

    /**
     * 批量删除
     */
    int deleteBath(@Param("pid") List<Integer> pid) throws DaoException;

    /**
     * 删除一个商品
     */
    int deleteById(@Param("proId") int proId) throws DaoException;

    /**
     * 修改商品信息
     */
    int updateBrand(@Param("brandDetail") BrandDetail brandDetail) throws DaoException;

    /**
     * 封禁商品
     */
    int updateBannedById(@Param("pid") int pid, @Param("status") int status) throws DaoException;

    /**
     * 查询某商品的详细信息
     */
    BrandDetail selectById(@Param("proId") int proId) throws DaoException;
}