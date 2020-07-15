package com.qfedu.service.impl;

import com.qfedu.domain.dto.ProDetailDto;
import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.mapper.BrandDetailMapper;
import com.qfedu.mapper.ProDetailDtoMapper;
import com.qfedu.service.BrandDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-14 14:49
 */
@Service
public class BrandDetailServiceImpl implements BrandDetailService {

    @Resource
    BrandDetailMapper brandDetailMapper;

    @Resource
    ProDetailDtoMapper proDetailDtoMapper;

    @Override
    public List<BrandDetail> selectByAttr(String attr) {
        List<BrandDetail> details = brandDetailMapper.selectByAttr(attr);
        return details;
    }

    @Override
    public List<BrandDetail> selectBySearch(String search) {
        List<BrandDetail> list = brandDetailMapper.selectBySearch(search);
        return list;
    }

    @Override
    public List<String> selectForAttr() {
        List<String> strings = brandDetailMapper.selectForAttr();
        return strings;
    }

    @Override
    public ProDetailDto selectByProId(Integer proId) {
        ProDetailDto pdd = proDetailDtoMapper.selectByProId(proId);
        return pdd;
    }


}
