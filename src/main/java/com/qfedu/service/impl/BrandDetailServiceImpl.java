package com.qfedu.service.impl;

import com.qfedu.domain.dto.BrandDetailDto;
import com.qfedu.domain.entity.Brand;
import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.mapper.BrandDetailMapper;
import com.qfedu.mapper.BrandMapper;
import com.qfedu.service.BrandDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class BrandDetailServiceImpl implements BrandDetailService {
    @Resource
    BrandDetailMapper brandDetailMapper;
    @Resource
    BrandMapper brandMapper;

    @Override
    public int add(BrandDetailDto brandDetailDto) {
//        Brand brand = brandMapper.selectById(brandDetailDto.getBrandName());
//        int brandId = brand.getId();
//        int proId = ( brandId - brandId % 10 ) * 10 + (int)(Math.random() * 999);
//        if (brandDetailMapper.selectById(proId) != null){
//            return add(brandDetailDto);
//        }
        BrandDetail brandDetailAdd = new BrandDetail();
//        brandDetailAdd.setProId(proId);
        brandDetailAdd.setProName(brandDetailDto.getProName());
        brandDetailAdd.setOldPrice(brandDetailDto.getOldPrice());
        brandDetailAdd.setNewPrice(brandDetailDto.getNewPrice());
        brandDetailAdd.setReleaseTime(brandDetailDto.getReleaseTime());
        brandDetailAdd.setExamine(brandDetailDto.getExamine());
        brandDetailAdd.setStatus(brandDetailDto.getStatus());
        brandDetailAdd.setAttribute(brandDetailDto.getAttribute());
        return brandDetailMapper.insertProduct(brandDetailAdd);
    }

    @Override
    public int deleteBath(List<Integer> ids) {
        return brandDetailMapper.deleteBath(ids);
    }

    @Override
    public int deleteById(int proId) {
        return brandDetailMapper.deleteById(proId);
    }

    @Override
    public int updateBrandDetail(int proId, BrandDetailDto brandDetailDto) {
        BrandDetail brandDetail = new BrandDetail();
        brandDetail.setProId(proId);
        brandDetail.setOldPrice(brandDetailDto.getOldPrice());
        brandDetail.setNewPrice(brandDetailDto.getNewPrice());
        brandDetail.setReleaseTime(brandDetailDto.getReleaseTime());
        brandDetail.setExamine(brandDetailDto.getExamine());
        brandDetail.setStatus(brandDetailDto.getStatus());
        return brandDetailMapper.updateBrand(brandDetail);
    }

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

    @Override
    public List<BrandDetail> selectAllById(int id, int page, int size) {
        return brandDetailMapper.selectAllById(id, ( page-1 ) * size, size);
    }

    @Override
    public BrandDetail selectById(int proId) {
        return brandDetailMapper.selectById(proId);
    }
}
