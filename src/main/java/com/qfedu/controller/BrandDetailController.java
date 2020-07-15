package com.qfedu.controller;

import com.qfedu.domain.entity.BrandDetail;
import com.qfedu.exception.ServiceException;
import com.qfedu.service.BrandDetailService;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
