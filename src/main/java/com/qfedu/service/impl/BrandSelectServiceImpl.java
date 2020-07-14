package com.qfedu.service.impl;

import com.qfedu.domain.dto.BrandDto;
import com.qfedu.domain.entity.Brand;
import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.mapper.BrandDetailMapper;
import com.qfedu.mapper.BrandManagerMapper;
import com.qfedu.service.BrandSelectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandSelectServiceImpl implements BrandSelectService {
    @Autowired
    BrandManagerMapper brandManagerMapper;
    @Autowired
    BrandDetailMapper brandDetailMapper;

    /**
     * 根据商品名和上架时间查询
     *
     * @param brandDto
     * @return
     */
    @Override
    public List<Brand> selectBrand(BrandDto brandDto) {
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandDto, brand);
        List<Brand> brands = brandManagerMapper.selectByNameAndTime(brand);
        return brands;
    }

    /**
     * 通过商品id,国家,品牌查询---精确查询
     *
     * @param brandDto
     * @return
     */
    @Override
    public Brand selectBrandById(BrandDto brandDto) {
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandDto, brand);
        brandManagerMapper.selectById(brand);
        return brand;
    }

    /**
     * 添加商品
     *
     * @param brandDto
     * @return
     */
    @Override
    @Transactional
    public int insertBrand(BrandDto brandDto) {
        Brand brand = new Brand();
        BrandDetail brandDetail = new BrandDetail();
        BeanUtils.copyProperties(brandDto, brand);
        BeanUtils.copyProperties(brandDto.getBrandDetailDto(), brandDetail);
        int a = brandManagerMapper.insert(brand);
        int b = brandDetailMapper.insert(brandDetail);
        if (a != 0 && b != 0) {
            return a + b;
        } else {
            return 0;
        }

    }

    /**
     * 分页查询
     *
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<Brand> selectAll(int limit, int offset) {
        List<Brand> brands = brandManagerMapper.selectByBatch(limit, offset);
        return brands;
    }

    /**
     * 批量删除
     *
     * @param id
     * @return
     */
    @Override
    public int update(List<Integer> id) {
        int count = brandManagerMapper.update(id);
        brandDetailMapper.update(id);
        return count;
    }

    /**
     * 根据国家查询商品信息
     *
     * @param country
     * @return
     */
    @Override
    public List<Brand> selectByCountry(String country) {

        return brandManagerMapper.selectByCountry(country);
    }
}
