package com.qfedu.service;

import com.qfedu.domain.dto.BrandDetailDto;
import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-mybatis.xml"})
public class BrandDetailServiceTest {

    @Resource
    BrandDetailService brandDetailService;
    @Test
    public void add() {
    }

    @Test
    public void deleteBath() throws ServiceException {
        List<Integer> list = new ArrayList<>();
        list.add(120111);
        list.add(120112);
        brandDetailService.deleteBath(list);
    }

    @Test
    public void deleteById() throws ServiceException {
        brandDetailService.deleteById(120111);
    }

    @Test
    public void updateBrandDetail() throws ServiceException {
        BrandDetailDto brandDetailDto = new BrandDetailDto();
        brandDetailDto.setExamine(1);
        brandDetailService.updateBrandDetail(120101, brandDetailDto);
    }

    @Test
    public void updateBannedById() throws ServiceException {
        brandDetailService.updateBannedById(120101);
    }

    @Test
    public void selectAllById() throws ServiceException {
        brandDetailService.selectAllById(12001, 1, 10);
    }

    @Test
    public void selectById() throws ServiceException {
        brandDetailService.selectById(120101);
    }
}