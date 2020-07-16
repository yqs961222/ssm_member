package com.qfedu.mapper;


import com.qfedu.domain.entity.Carts;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author FUTURE
 */
public interface CartsMapper {
    /**
     * 查询购物车
     *
     * @param memberId
     * @return
     */
    List<Carts> selectCart2ById(@Param("memberId") int memberId);

    /**
     * 添加商品
     *
     * @param carts
     * @return
     */
    int insertCarts(@Param("carts") Carts carts);

    /**
     * 查询购物车商品是否存在
     * 这里要通过商品id和会员id一起查询,因为表里里面存了很多人的数据,而不是只有一个人的数据
     *
     * @param productId
     * @param memberId
     * @return
     */
    Carts selectCart2ByProductId(@Param("productId") int productId, @Param("memberId") int memberId);

    /**
     * 更新购物车商品数量
     * 这里可以根据购物车id去查询购物车信息,否则就必须通过商品id和会员id联合查询
     *
     * @param quantity
     * @return
     */
    int updateQuantity(@Param("quantity") int quantity, @Param("cartId") int cartId);

}