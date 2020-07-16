package com.qfedu.service;

import com.qfedu.domain.dto.CartsDto;
import com.qfedu.domain.entity.Carts;
import com.qfedu.exception.ServiceException;

import java.util.List;

/**
 * @author FUTURE
 */
public interface CartsService {
    /**
     * 查询购物车
     * @param memberId
     * @return
     */
    List<Carts> selectAll(int memberId) throws ServiceException;

    /**
     * 往购物车添加商品
     * @param cartsDto
     * @return
     */
    int insertCarts(CartsDto cartsDto) throws ServiceException;
}
