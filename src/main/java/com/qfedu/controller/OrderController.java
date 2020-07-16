package com.qfedu.controller;

import com.qfedu.domain.dto.OrderDto;
import com.qfedu.domain.entity.Order;
import com.qfedu.domain.entity.OrderItem;
import com.qfedu.service.OrderService;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FUTURE
 */
@RestController
public class OrderController {
    @Resource
    OrderService orderService;

    /**
     * 保存订单
     * 更新库存
     *
     * @param orderDto
     * @return
     */
    @PostMapping("/add")
    public ResponseUtils add(OrderDto orderDto) {
        int count = orderService.insertOrder(orderDto);
        if (count != 0) {
            return ResponseUtils.success(ErrorStatus.POST_SUCCESS);
        } else {
            return ResponseUtils.error(ErrorStatus.CONTROLLER_ERROR);
        }
    }

    /**
     * 查询订单
     *
     * @param memberId
     * @return
     */
    @GetMapping("/order")
    public ResponseUtils<Order> find(int memberId) {
        Order order = orderService.selectOrderByMemberId(memberId);
        if (order != null) {
            return ResponseUtils.success(ErrorStatus.GET_SUCCESS, order);
        } else {
            return ResponseUtils.error(ErrorStatus.CONTROLLER_ERROR);
        }
    }

    /**
     * 查询订单详情
     *
     * @param memberId
     * @return
     */
    @PostMapping("/orderItem")
    public ResponseUtils findAll(int memberId) {
        List<OrderItem> orderItems = orderService.selectAll(memberId);
        if (orderItems != null) {
            return ResponseUtils.success(ErrorStatus.POST_SUCCESS);
        } else {
            return ResponseUtils.error(ErrorStatus.CONTROLLER_ERROR);
        }
    }
}
