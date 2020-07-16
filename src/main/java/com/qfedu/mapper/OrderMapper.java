package com.qfedu.mapper;

import com.qfedu.domain.entity.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @author FUTURE
 */
public interface OrderMapper {

    /**
     * 保存订单
     * @param order
     * @return
     */
    int insert(@Param("order") Order order);

    /**
     * 查询订单
     * @param memberId
     * @return
     */
    Order selectOrder(@Param("memberId") int memberId);


}