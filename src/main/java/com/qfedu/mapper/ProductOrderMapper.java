package com.qfedu.mapper;

import com.qfedu.domain.entity.ProductOrder;

public interface ProductOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(ProductOrder record);

    int insertSelective(ProductOrder record);

    ProductOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(ProductOrder record);

    int updateByPrimaryKey(ProductOrder record);
}