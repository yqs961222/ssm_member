package com.qfedu.controller;

import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.ServiceException;
import com.qfedu.service.BrandDetailService;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-14 14:40
 */

@RestController
@RequestMapping("/detail")
public class BrandDetailController {

    @Resource
    BrandDetailService brandDetailService;

    /**
     * 通过属性来查询商品集合, 可以动态地接收请求以完成不同的数据传输
     *
     * @param attribute 动态的传入属性值
     * @return 返回一个响应值, 成功即输出结果, 失败则输出错误报告
     */
    @GetMapping("/select/{attribute}")
    public ResponseEntity<List<BrandDetail>> selectByAttr(@PathVariable("attribute") String attribute) throws ServiceException {
        /*  int num = brandDetailService.selectNum();
            List<BrandDetail> brandDetails = brandDetailService.selectGetAttr();
            for (BrandDetail brandDetail : brandDetails) {
                String attr = brandDetail.getAttribute();
                List<BrandDetail> details = brandDetailService.selectByAttr(attr);
            }*/
        // 通过输入的attribute属性, 查询到对应的对象集合
        List<BrandDetail> brandDetails = brandDetailService.selectByAttr(attribute);

        return ResponseEntity.success(brandDetails);
    }

    /**
     * 通过模糊输入的search值, 可以模糊查找到想要的数据
     *
     * @param search 输入的模糊值
     * @return 返回查找到的响应数据, 成功输出结果, 失败则输出错误报告
     */
    @GetMapping("/search")
    public ResponseEntity<List<BrandDetail>> selectBySearch(String search) throws ServiceException {
        // 通过输入的search, 可以查询到对应的对象集合
        List<BrandDetail> details = brandDetailService.selectBySearch(search);

        // 判断集合内容是否为null
        if (details != null) {
            return ResponseEntity.success(details);
        } else {
            return ResponseEntity.error(ErrorStatus.NO_DATA);
        }
    }

    /**
     * 查询出所有的属性
     *
     * @return 返回包含属性的集合
     */
    @GetMapping("/attr")
    public ResponseEntity<List<String>> selectForAttr() throws ServiceException {
        List<String> strings = brandDetailService.selectForAttr();
        return ResponseEntity.success(strings);
    }
}
