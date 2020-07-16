package com.qfedu.controller;

import com.qfedu.domain.dto.CartsDto;
import com.qfedu.domain.entity.Carts;
import com.qfedu.service.CartsService;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author FUTURE
 */
@RestController
public class CartsController {
    @Autowired
    CartsService cartsService;

    @PostMapping("/findAll")
    public ResponseUtils<List<Carts>> findAll(int memberId) {
        List<Carts> carts = cartsService.selectAll(memberId);
        if (carts != null) {
            return ResponseUtils.success(ErrorStatus.POST_SUCCESS, carts);
        } else {
            return ResponseUtils.error(ErrorStatus.CONTROLLER_ERROR);
        }
    }

    /**
     * 向购物车添加商品
     *
     * @param cartsDto
     * @return
     */
    @PostMapping("/add2")
    public ResponseUtils add(CartsDto cartsDto) {
        int count = cartsService.insertCarts(cartsDto);
        if (count != 0) {
            return ResponseUtils.success(ErrorStatus.POST_SUCCESS);
        } else {
            return ResponseUtils.error(ErrorStatus.CONTROLLER_ERROR);
        }
    }
}
