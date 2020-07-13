package com.qfedu.mapper;

import com.qfedu.domain.entity.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface BrandMapper {

    /**
     * 修改商品信息
     */
    int updateByBrand(@Param("id") int id, @Param("brand") Brand brand);
}