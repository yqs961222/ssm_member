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
    public ResponseEntity<Integer> modifyBrand(@RequestParam int id, @RequestBody Brand brand) throws ServiceException {
        // 传入ID, 和品牌对象, 修改品牌信息
        int ar = brandService.updateByBrand(id, brand);

        // 判断是否修改成功
        if (ar > 0) {
            return ResponseEntity.success(ar);
        } else {
            return ResponseEntity.error(ErrorStatus.UPDATE_ERROR);
        }
    }

    /**
     * 通过ID删除品牌记录, 这里是通过将status设值为3
     *
     * @param id 传入要删除品牌的id
     * @return 返回行数
     */
    @GetMapping("/delete")
    public ResponseEntity<Integer> deleteOne(int id) throws ServiceException {
        // 传入ID, 假删除品牌
        int ar = brandService.deleteById(id);

        // 判断是否删除成功
        if (ar > 0) {
            return ResponseEntity.success(ar);
        } else {
            return ResponseEntity.error(ErrorStatus.UPDATE_ERROR);
        }
    }
}
