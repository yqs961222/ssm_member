package com.qfedu.service;

import com.qfedu.domain.dto.BrandDetailDto;
import com.qfedu.domain.entity.BrandDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-mybatis.xml"})
public class BrandDetailServiceTest {

    @Resource
    BrandDetailService brandDetailService;
    @Test
    public void add() {
    }

    @Test
    public void deleteBath() {
    }

    @Test
    public void deleteById() {
    }

    @Test
    public void updateBrandDetail() {
        BrandDetailDto brandDetailDto = new BrandDetailDto();
        brandDetailDto.setExamine(1);
        brandDetailService.updateBrandDetail(120101, brandDetailDto);
    }

    @Test
    public void updateBannedById() {
        brandDetailService.updateBannedById(120101);
    }

    @Test
    public void selectAllById() {
        brandDetailService.selectAllById(12001, 1, 10);
    }

    @Test
    public void selectById() {
        brandDetailService.selectById(120101);
    }
}