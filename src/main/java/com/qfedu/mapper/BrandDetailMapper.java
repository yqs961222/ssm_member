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

}