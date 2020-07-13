package com.qfedu.controller;

import com.qfedu.service.BrandManageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/brand_manage")
public class BrandManageController {
    @Resource
    BrandManageService brandManageService;


}
