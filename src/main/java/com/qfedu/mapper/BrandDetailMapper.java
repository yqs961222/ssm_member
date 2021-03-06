package com.qfedu.mapper;

import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.DaoException;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.DaoException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandDetailMapper {
    /**
     * 添加商品详情
     * @param brandDetail
     * @return
     */
    int insert(@Param("brandDetail")BrandDetail brandDetail) throws DaoException;

    /**
     * Jesse
     * 通过属性查询商品信息
     */
    List<BrandDetail> selectByAttr(@Param("attr") String attr) throws DaoException;

    /**
     * Jesse
     * 通过search模糊值, 查找到对应的对象集合
     */
    List<BrandDetail> selectBySearch(@Param("search") String search) throws DaoException;

    /**
     * Jesse
     * 查询属性
     */
    List<String> selectForAttr() throws DaoException;


    /**
     * Jesse
     * 显示该品牌所有商品
     */
    List<BrandDetail> selectAllById(@Param("id") int id, @Param("page") int page, @Param("size") int size);

    /**
     * XTL
     * 添加品牌
     */
    int insertProduct(@Param("brandDetail") BrandDetail brandDetail) throws DaoException;

    /**
     * XTL
     * 批量删除
     */
    int deleteBath(@Param("pid") List<Integer> pid) throws DaoException;

    /**
     * XTL
     * 删除一个商品
     */
    int deleteById(@Param("proId") int proId) throws DaoException;

    /**
     * XTL
     * 修改商品信息
     */
    int updateBrand(@Param("brandDetail") BrandDetail brandDetail) throws DaoException;

    /**
     * XTL
     * 封禁商品
     */
    int updateBannedById(@Param("pid") int pid, @Param("status") int status) throws DaoException;

    /**
     * XTL
     * 查询某商品的详细信息
     */
    BrandDetail selectById(@Param("proId") int proId) throws DaoException;
    /**
     * 批量删除
     * @param list
     * @return
     */
    int update(@Param("list")List<Integer> list) throws DaoException;
}