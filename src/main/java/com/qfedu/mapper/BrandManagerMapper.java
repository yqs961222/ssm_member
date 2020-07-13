package com.qfedu.mapper;

import com.qfedu.domain.dto.BrandDto;
import com.qfedu.domain.entity.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BrandManagerMapper {
    /**
     * 根据商品名和上架时间查询
     * @return 返回查询的商品对象
     */
    List<Brand> selectByNameAndTime(@Param("brandDto") BrandDto brandDto);
}