package com.qfedu.service.impl;

import com.qfedu.mapper.BrandDetailMapper;
import com.qfedu.service.BrandDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BrandDetailServiceImpl implements BrandDetailService {
    @Resource
    BrandDetailMapper brandDetailMapper;
}
