package com.qfedu.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author FUTURE
 */
@Data
public class Carts implements Serializable {
    /**
    * 购物车id
    */
    private Integer cartsId;

    /**
    * 商品数量
    */
    private Integer productQuantity;

    /**
    * 总价
    */
    private BigDecimal productPrice;

    /**
    * 商品图片
    */
    private String productPic;

    /**
    * 商品名字
    */
    private String productName;

    /**
    * 商品属性
    */
    private String productAtt;

    /**
    * 商品描述
    */
    private String productDes;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 0表示已付款
    */
    private Integer status;

    /**
    * 会员id
    */
    private Integer memberId;

    /**
     * 商品id
     */
    private Integer productId;


}