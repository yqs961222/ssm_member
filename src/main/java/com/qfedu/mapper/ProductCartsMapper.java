package com.qfedu.mapper;

import com.qfedu.domain.entity.ProductCarts;

public interface ProductCartsMapper {
    int deleteByPrimaryKey(Integer cartsId);

    int insert(ProductCarts record);

    int insertSelective(ProductCarts record);

    ProductCarts selectByPrimaryKey(Integer cartsId);

    int updateByPrimaryKeySelective(ProductCarts record);

    int updateByPrimaryKey(ProductCarts record);
}