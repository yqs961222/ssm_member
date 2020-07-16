package com.qfedu.service.impl;

import com.qfedu.domain.dto.BrandDetailDto;
import com.qfedu.domain.dto.ProDetailDto;
import com.qfedu.domain.entity.Brand;
import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.ServiceException;
import com.qfedu.mapper.BrandDetailMapper;
import com.qfedu.mapper.ProDetailDtoMapper;
import com.qfedu.mapper.BrandMapper;
import com.qfedu.service.BrandDetailService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Jesse Y
 * @Author: XTL
 * @Data: 2020-07-14 14:49
 */
@Service
public class BrandDetailServiceImpl implements BrandDetailService {

    @Resource
    BrandDetailMapper brandDetailMapper;

    @Resource
    ProDetailDtoMapper proDetailDtoMapper;

    @Resource
    BrandMapper brandMapper;

    // XTL
    @Override
    public int add(BrandDetailDto brandDetailDto)  {
        Brand brand = new Brand();
        brand.setBrandName(brandDetailDto.getBrandName());
        brand = brandMapper.selectById(brand);
        int brandId = brand.getId();
        int proId = ( brandId - brandId % 10 ) * 10 + (int)(Math.random() * 999);
        if (brandDetailMapper.selectById(proId) != null){
            return add(brandDetailDto);
        }
        BrandDetail brandDetailAdd = new BrandDetail();
         brandDetailAdd.setProId(proId);
        BeanUtils.copyProperties(brandDetailDto, brandDetailAdd);

        return brandDetailMapper.insertProduct(brandDetailAdd);
    }

    // XTL
    @Override
    public int deleteBath(List<Integer> ids) {
        return brandDetailMapper.deleteBath(ids);
    }

    // XTL
    @Override
    public int deleteById(int proId) {
        return brandDetailMapper.deleteById(proId);
    }

    // XTL
    @Override
    public int updateBrandDetail(int proId, BrandDetailDto brandDetailDto) {
        BrandDetail brandDetail = new BrandDetail();
        /*通过反射复制对象
        BeanUtils.copyProperties(要拷贝的对象, 目标对象);*/
        BeanUtils.copyProperties(brandDetailDto, brandDetail);
        brandDetail.setProId(proId);
        return brandDetailMapper.updateBrand(brandDetail);
    }

    // XTL
    @Override
    public int updateBannedById(int proId) {
        BrandDetail brandDetail = brandDetailMapper.selectById(proId);
        int status = brandDetail.getStatus();
        if (status == 0){
            status = 1;
        }else {
            status =0;
        }
        return brandDetailMapper.updateBannedById(proId, status);
    }

    // XTL
    @Override
    public List<BrandDetail> selectAllById(int id, int page, int size) {
        page = (page -1) * size;
        return brandDetailMapper.selectAllById(id, page, size);
    }

    // XTL
    @Override
    public BrandDetail selectById(int proId) {
        return brandDetailMapper.selectById(proId);
    }

    // Jesse
    @Override
    public List<BrandDetail> selectByAttr(String attr) {
        List<BrandDetail> details = brandDetailMapper.selectByAttr(attr);
        return details;
    }

    // Jesse
    @Override
    public List<BrandDetail> selectBySearch(String search) {
        List<BrandDetail> list = brandDetailMapper.selectBySearch(search);
        return list;
    }

    // Jesse
    @Override
    public List<String> selectForAttr() throws ServiceException {
        List<String> strings = brandDetailMapper.selectForAttr();
        return strings;
    }

    // Jesse
    @Override
    public ProDetailDto selectByProId(Integer proId) {
        ProDetailDto pdd = proDetailDtoMapper.selectByProId(proId);
        return pdd;
    }
}
