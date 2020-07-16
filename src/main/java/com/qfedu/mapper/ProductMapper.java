package com.qfedu.mapper;

import com.qfedu.domain.entity.Product;
import org.apache.ibatis.annotations.Param;

/**
 * @author FUTURE
 */
public interface ProductMapper {
   /**
    * 查询商品
    * @param productId
    * @return
    */
   Product selectByProductId(@Param("productId") int productId);

   /**
    * 更新库存
    * @param product
    * @return
    */
   int updateStock(@Param("product") Product product);


}