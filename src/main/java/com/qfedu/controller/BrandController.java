package com.qfedu.controller;

import com.qfedu.domain.entity.Brand;
import com.qfedu.exception.ServiceException;
import com.qfedu.service.BrandService;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Integer> updateBrand(@RequestParam int id, @RequestBody Brand brand) {
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

    /**
     * 通过ID删除品牌记录, 这里是通过将status设值为3
     *
     * @param id 传入要删除品牌的id
     * @return 返回行数
     */
    @GetMapping("/delete")
    public ResponseEntity<Integer> deleteOne(int id) {
        try {
            int ar = brandService.deleteById(id);
            if (ar > 0) {
                return ResponseEntity.success(ar);
            } else {
                return ResponseEntity.error(ErrorStatus.UPDATE_ERROR);
            }
        } catch (ServiceException e) {
            return ResponseEntity.error(ErrorStatus.SYS_ERROR);
        }
    }
}
