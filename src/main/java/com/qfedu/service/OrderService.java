package com.qfedu.service;

import com.qfedu.domain.dto.OrderDto;
import com.qfedu.domain.entity.Order;
import com.qfedu.domain.entity.OrderItem;
import com.qfedu.exception.ServiceException;

import java.util.List;

/**
 * @author FUTURE
 */
public interface OrderService {
    /**
     * 保存订单
     *
     * @param orderDto
     * @return
     */
    int insertOrder(OrderDto orderDto) throws ServiceException;

    /**
     * 查询订单
     *
     * @param memberId
     * @return
     */
    Order selectOrderByMemberId(int memberId) throws ServiceException;

    /**
     * 查询订单详情
     *
     * @param memberId
     * @return
     */
    List<OrderItem> selectAll(int memberId) throws ServiceException;
}
