package com.qfedu.controller;

import com.qfedu.domain.entity.Brand;
import com.qfedu.service.BrandService;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-13 10:59
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Resource
    BrandService brandService;

    /**
     * 品牌修改接口
     * 对品牌信息进行修改
     *
     * @param brand 传入一个品牌对象
     * @return 返回修改的影响行数
     */
    @PostMapping("/update")
    public ResponseEntity<Integer> updateBrand(int id, Brand brand) {
        try {
            int ar = brandService.updateByBrand(id, brand);
            if (ar > 0) {
                return ResponseEntity.success(ar);
            } else {
                return ResponseEntity.error(ErrorStatus.UPDATE_ERROR);
            }
        } catch (Exception exception) {
            return ResponseEntity.error(ErrorStatus.SYS_ERROR);
        }
    }
}
