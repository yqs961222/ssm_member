package com.qfedu.service.impl;

import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.ServiceException;
import com.qfedu.mapper.BrandDetailMapper;
import com.qfedu.mapper.BrandMapper;
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

    @Override
    public List<BrandDetail> selectByAttr(String attr) {
        List<BrandDetail> details = brandDetailMapper.selectByAttr(attr);
        return details;
    }


    @Override
    public int selectNum() {
        int num = brandDetailMapper.selectNum();
        return num;
    }


    @Override
    public List<BrandDetail> selectGetAttr() {
        List<BrandDetail> brandDetails = brandDetailMapper.selectGetAttr();
        return brandDetails;
    }
}
