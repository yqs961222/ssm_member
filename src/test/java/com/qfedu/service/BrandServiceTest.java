package com.qfedu.service;

import com.qfedu.domain.entity.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-mybatis.xml"})
public class BrandServiceTest {

    @Resource
    BrandService brandService;

    @Test
    public void updateByBrand() {
        Brand brand = new Brand();
        brand.setBrandLogo("123456.png");
        int ar = brandService.updateByBrand(12001, brand);
        System.out.println(ar);
    }
}