package com.qfedu.controller;

import com.qfedu.domain.dto.BrandDto;
import com.qfedu.domain.entity.Brand;

import com.qfedu.service.BrandSelectService;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BrandManagerController {
    @Resource
    BrandSelectService brandSelectService;

    /**
     * 根据商品名和上架时间查询
     * @param brandDto
     * @return
     */
    @PostMapping("/find")
    public ResponseUtils<List<Brand>> findByNameOrTime(BrandDto brandDto) {
        List<Brand> brands = brandSelectService.selectBrand(brandDto);
        return ResponseUtils.success(ErrorStatus.POST_SUCCESS,brands);
    }

    /**
     * 通过商品id,国家,品牌查询---精确查询
     * @param brandDto
     * @return
     */
    @PostMapping("/select")
    public ResponseUtils<Brand> findById(BrandDto brandDto) {
        Brand brands = brandSelectService.selectBrandById(brandDto);
        return ResponseUtils.success(ErrorStatus.POST_SUCCESS,brands);
    }

    /**
     * 添加商品
     * @param brandDto
     * @return
     */
    @PostMapping("/add")
    public ResponseUtils<Integer> addBrand(BrandDto brandDto) {
        int count = brandSelectService.insertBrand(brandDto);
        return ResponseUtils.success(ErrorStatus.POST_SUCCESS,count);
    }

    /**
     * 分页查询
     * @param limit
     * @param offset
     * @return
     */
    @GetMapping ("/selectAll")
    public ResponseUtils<List<Brand>> findByBatch(@RequestParam(defaultValue = "0") int limit, @RequestParam(defaultValue = "10") int offset) {
        List<Brand> brands = brandSelectService.selectAll(limit, offset);
        return ResponseUtils.success(ErrorStatus.SUUESS,brands);
    }

    /**
     * 批量删除
     * @param id
     * @return
     */
    @PostMapping("/update")
    public ResponseUtils<Integer> modify(List<Integer> id) {
        int count = brandSelectService.update(id);
        return ResponseUtils.success(ErrorStatus.POST_SUCCESS,count);
    }

    /**
     * 根据国家查询品跑信息
     * @param country
     * @return
     */
    @GetMapping ("/selectByCountry")
    public ResponseUtils<List<Brand>> findByCountry(String country) {
        List<Brand> brands = brandSelectService.selectByCountry(country);
        return ResponseUtils.success(ErrorStatus.SUUESS,brands);
    }
}
