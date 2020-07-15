package com.qfedu.service.impl;

import com.qfedu.domain.entity.Brand;
import com.qfedu.mapper.BrandMapper;
import com.qfedu.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-13 14:32
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Resource
    BrandMapper brandMapper;

    /**
     * 修改传入的品牌信息
     */
    @Override
    public int updateByBrand(int id, Brand brand) {
//        int ar = brandMapper.updateByBrand(id, brand);
        return 0;
    }

    /**
     * 删除传入ID的品牌,假删除
     */
    @Override
    public int deleteById(int id) {
        int ar = brandMapper.deleteById(id);
        return ar;
    }

}
