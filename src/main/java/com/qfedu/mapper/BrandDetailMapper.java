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



}