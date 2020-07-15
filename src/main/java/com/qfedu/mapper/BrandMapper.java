package com.qfedu.mapper;

import com.qfedu.domain.entity.Brand;
import com.qfedu.exception.DaoException;
import org.apache.ibatis.annotations.Param;


public interface BrandMapper {

    /**
     * 修改商品信息
     */
    int updateByBrand(@Param("id") int id, @Param("brand") Brand brand) throws DaoException;

    /**
     * 删除品牌信息, 这里用到的是假删除
     */
    int deleteById(@Param("id") int id);

    /**
     * 查询一条品牌信息, 通过品牌的id
     */
    Brand selectOne(@Param("id") int id);
}