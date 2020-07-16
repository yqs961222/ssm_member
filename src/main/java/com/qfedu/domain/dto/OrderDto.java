package com.qfedu.domain.dto;


import lombok.Data;

import java.util.List;

/**
 * @author LY
 * @date
 */
@Data
public class OrderDto {
    //这里面只能传共性的东西,购物车里每一条购买记录都是一个对象
    private List<CartsDto> carts;
    /**
     * 会员id
     */
    private Integer memberId;
}
