package com.qfedu.service.impl;

import com.qfedu.domain.dto.CartsDto;
import com.qfedu.domain.dto.OrderDto;
import com.qfedu.domain.entity.Order;
import com.qfedu.domain.entity.OrderItem;
import com.qfedu.domain.entity.Product;
import com.qfedu.exception.ServiceException;
import com.qfedu.mapper.OrderItemMapper;
import com.qfedu.mapper.OrderMapper;
import com.qfedu.mapper.ProductMapper;
import com.qfedu.service.OrderService;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.GenerateCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author FUTURE
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    OrderItemMapper orderItemMapper;


    /**
     * 保存订单
     * 更新库存
     * 展示订单信息
     *
     * @param orderDto
     * @return
     */
    @Transactional()
    @Override
    public int insertOrder(OrderDto orderDto) throws ServiceException {
        String orderNo = GenerateCodeUtil.createCodeNum("orderDto.getMemberId()");
        List<CartsDto> carts = orderDto.getCarts();
        BigDecimal total = new BigDecimal(0);
        for (CartsDto cart : carts) {
            //更新库存
            Product product = productMapper.selectByProductId(cart.getProductId());
            int stock = product.getProductStock();
            int quantity = cart.getProductQuantity();
            if (stock <= quantity) {
                stock -= quantity;
                product.setProductStock(stock);
                int i = productMapper.updateStock(product);

                if (i == 0) {
                    throw new ServiceException(ErrorStatus.SERVICE_ERROR);
                }
//这里计算总价必须放在if条件判断里,否则更新库存失败,但是任然计算出价格
                //将 BigInteger转换成 BigDecimal 。
                BigDecimal count = new BigDecimal(cart.getProductQuantity());
                BigDecimal price = product.getNewPrice();
                //返回 BigDecimal ，其值是 (this × multiplicand)，其标为 (this.scale() + multiplicand.scale())
                BigDecimal multiply = price.multiply(count);
                //返回 BigDecimal ，其值是 (this + augend) ，其标为 max(this.scale(), augend.scale()) 。
                total.add(multiply);
                //展示订单信息
                OrderItem orderItem = new OrderItem();
                orderItem.setMemberId(orderDto.getMemberId());
                orderItem.setOrderNo(Integer.valueOf(orderNo));
                orderItem.setProductDes(product.getProductDes());
                orderItem.setProductName(product.getProductName());
                orderItem.setProductPic(product.getProductImg());
                orderItem.setProductPrice(product.getNewPrice());
                orderItem.setProductQuantity(cart.getProductQuantity());
                orderItemMapper.insert(orderItem);

            } else {
                throw new ServiceException(ErrorStatus.SERVICE_ERROR);
            }

        }
        Order order = new Order();
        order.setMemberId(orderDto.getMemberId());
        order.setOrderNo(Integer.valueOf(orderNo));
        order.setTotal(total);
        int count = orderMapper.insert(order);
        return count;
    }

    /**
     * 查询订单
     *
     * @param memberId
     * @return
     */
    @Override
    public Order selectOrderByMemberId(int memberId) {
        Order order = orderMapper.selectOrder(memberId);
        return order;
    }

    /**
     * 查询订单详情
     *
     * @param memberId
     * @return
     */
    @Override
    public List<OrderItem> selectAll(int memberId) {
        List<OrderItem> orderItems = orderItemMapper.selectOrderItem(memberId);
        return orderItems;
    }
}
