package com.qfedu.controller;

import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.ServiceException;
import com.qfedu.service.BrandDetailService;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
    public ResponseEntity<List<BrandDetail>> selectByAttr(@PathVariable("attribute") String attribute ) {
        try {
          /*  int num = brandDetailService.selectNum();
            List<BrandDetail> brandDetails = brandDetailService.selectGetAttr();
            for (BrandDetail brandDetail : brandDetails) {
                String attr = brandDetail.getAttribute();
                List<BrandDetail> details = brandDetailService.selectByAttr(attr);
            }*/

            List<BrandDetail> brandDetails = brandDetailService.selectByAttr(attribute);
            return ResponseEntity.success(brandDetails);

        } catch (ServiceException e) {
            return ResponseEntity.error(ErrorStatus.SYS_ERROR);
        }
    }

    @PostMapping("/search")
    public ResponseEntity<List<BrandDetail>> selectBySearch(String search) {

        return null;
    }
}
