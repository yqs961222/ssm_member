package com.qfedu.service.impl;

import com.qfedu.domain.dto.CartsDto;
import com.qfedu.domain.entity.Carts;
import com.qfedu.domain.entity.Product;
import com.qfedu.exception.ServiceException;
import com.qfedu.mapper.CartsMapper;
import com.qfedu.mapper.ProductMapper;
import com.qfedu.service.CartsService;
import com.qfedu.utils.ErrorStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author FUTURE
 */
@Service
public class CartsServiceImpl implements CartsService {
    @Autowired
    CartsMapper cartsMapper;
    @Autowired
    ProductMapper productMapper;

    /**
     * 查询购物车
     *
     * @param memberId
     * @return
     */
    @Override
    public List<Carts> selectAll(int memberId) {
        List<Carts> carts = cartsMapper.selectCart2ById(memberId);
        return carts;
    }

    /**
     * 往购物车添加商品
     *
     * @param cartsDto
     * @return
     */
    @Transactional
    @Override
    public int insertCarts(CartsDto cartsDto) throws ServiceException{
        int productId = cartsDto.getProductId();
        Carts carts1 = cartsMapper.selectCart2ByProductId(productId, cartsDto.getMemberId());
        //判断购物车是否存在该商品
        if (carts1 != null) {
            int quantity = cartsDto.getProductQuantity();
            int quantity1 = carts1.getProductQuantity();
            quantity += quantity1;
            int i = cartsMapper.updateQuantity(quantity, cartsDto.getCartsId());
            if (i == 0) {
                throw new ServiceException(ErrorStatus.SERVICE_ERROR);
            }

        } else {
            Product product = productMapper.selectByProductId(productId);
            Carts carts = new Carts();
//这里设置字段不合适,否则就可以使用工具类,直接copy了
            carts.setMemberId(cartsDto.getMemberId());
            carts.setProductAtt(product.getProductAtt());
            carts.setProductDes(product.getProductDes());
            carts.setProductName(product.getProductName());
            carts.setProductPic(product.getProductImg());
            carts.setProductPrice(product.getNewPrice());
            int count = cartsMapper.insertCarts(carts);
        }

        return 1;
    }

}
