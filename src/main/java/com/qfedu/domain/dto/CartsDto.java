package com.qfedu.domain.dto;

import lombok.Data;

/**
 * @author FUTURE
 */
@Data
public class CartsDto {
    /**
     * 购物车id
     */
    private Integer cartsId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 会员id
     */
    private Integer memberId;
}
