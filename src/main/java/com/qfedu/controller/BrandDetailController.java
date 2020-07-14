package com.qfedu.controller;

import com.qfedu.domain.dto.BrandDetailDto;
import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.service.BrandDetailService;
import com.qfedu.utils.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/detail")
public class BrandDetailController {

    @Resource
    BrandDetailService brandDetailService;

    /**
     * 显示所有
     * @param id 品牌id
     * @param page 分页
     * @param size 分页
     * @return 状态码与结果集
     */
    @GetMapping("/list/{id}")
    public ResponseEntity<List<BrandDetail>> showAll(@PathVariable Integer id, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size){
        List<BrandDetail> list = brandDetailService.selectAllById(id, page, size);
        return ResponseEntity.success(list);
    }

    /**
     * 添加商品
     * @param brandDetailDto
     * @return
     */
    @PostMapping("/add")
    public ResponseEntity<Integer> addBrandDetail(@RequestBody BrandDetailDto brandDetailDto){
        int count = brandDetailService.add(brandDetailDto);
        return ResponseEntity.success(count);
    }

    /**
     * 批量删除
     * @param ids 结果集
     * @return
     */
    @PostMapping("/delete")
    public ResponseEntity<Integer> deleteBath(@RequestParam List<Integer> ids){
        int count = brandDetailService.deleteBath(ids);
        return ResponseEntity.success(count);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @PostMapping("/del")
    public ResponseEntity<Integer> deleteById(@RequestParam Integer id){
        int count = brandDetailService.deleteById(id);
        return ResponseEntity.success(count);
    }

    /**
     * 更新商品
     * @param id
     * @param brandDetailDto
     * @return
     */
    @PostMapping("/update")
    public ResponseEntity<Integer> updateBrandDetail(@RequestParam int id, @RequestBody BrandDetailDto brandDetailDto){
        int count = brandDetailService.updateBrandDetail(id, brandDetailDto);
        return ResponseEntity.success(count);
    }

    /**
     * 封禁
     * @param id
     * @return
     */
    @PostMapping("/banned")
    public ResponseEntity<Integer> updateBannedById(@RequestParam int id){
        int count = brandDetailService.updateBannedById(id);
        return ResponseEntity.success(count);
    }

}
