package com.qfedu.mapper;

import com.qfedu.domain.entity.BrandDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BrandDetailMapper {
    /**
     * 添加商品详情
     * @param brandDetail
     * @return
     */
    int insert(@Param("brandDetail")BrandDetail brandDetail);

    /**
     * 批量删除
     * @param list
     * @return
     */
    int update(@Param("list")List<Integer> list);
}