package com.qfedu.mapper;

import com.qfedu.domain.entity.OrderItem;
import com.qfedu.exception.DaoException;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author FUTURE
 */
public interface OrderItemMapper {
    /**
     * 保存订单详情
     *
     * @param orderItem
     * @return
     */
    int insert(@Param("orderItem") OrderItem orderItem) throws DaoException;

    /**
     * 查询订单详情
     * @param memberId
     * @return
     */
    List<OrderItem> selectOrderItem(@Param("memberId") int memberId);


}