package com.qfedu.controller;

import com.qfedu.domain.dto.BrandDetailDto;
import com.qfedu.domain.dto.ProDetailDto;
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
 * @Author: XTL
 * @Data: 2020-07-14 14:40
 */

@RestController
@RequestMapping("/detail")
public class BrandDetailController {

    @Resource
    BrandDetailService brandDetailService;

    /**
     * Jesse
     * 通过属性来查询商品集合, 可以动态地接收请求以完成不同的数据传输
     *
     * @param attribute 动态的传入属性值
     * @return 返回一个响应值, 成功即输出结果, 失败则输出错误报告
     */
    @GetMapping("/select/{attribute}")
    public ResponseEntity<List<BrandDetail>> showByAttr(@PathVariable("attribute") String attribute) throws ServiceException {
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
     * Jesse
     * 通过模糊输入的search值, 可以模糊查找到想要的数据
     *
     * @param search 输入的模糊值
     * @return 返回查找到的响应数据, 成功输出结果, 失败则输出错误报告
     */
    @GetMapping("/search")
    public ResponseEntity<List<BrandDetail>> showBySearch(String search) throws ServiceException {
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
     * Jesse
     * 查询出所有的属性
     *
     * @return 返回包含属性的集合
     */
    @GetMapping("/attr")
    public ResponseEntity<List<String>> showForAttr() throws ServiceException {
        List<String> strings = brandDetailService.selectForAttr();
        return ResponseEntity.success(strings);
    }

    /**
     * Jesse
     * 通过商品的ID查询出对应的商品详情表
     *
     * @param proId 传入的商品ID
     * @return 返回的是商品详情表对象的集合
     */
    @GetMapping("/product")
    public ResponseEntity<ProDetailDto> showByProId(Integer proId) throws ServiceException {
        ProDetailDto proDetailDto = brandDetailService.selectByProId(proId);
        if (proDetailDto != null) {
            return ResponseEntity.success(proDetailDto);
        } else {
            return ResponseEntity.error();
        }
    }

    /**
     * XTL
     * 显示所有
     * @param id 品牌id
     * @param page 分页
     * @param size 分页
     * @return 状态码与结果集
     */
    @GetMapping("/list/{id}")
    public ResponseEntity<List<BrandDetail>> showAll(@PathVariable() Integer id, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) throws ServiceException {
        List<BrandDetail> list = brandDetailService.selectAllById(id, page, size);
        return ResponseEntity.success(list);
    }

    /**
     * XTL
     * 添加商品
     * @param brandDetailDto 传入商品详情
     * @return 返回影响的行数, 成功返回1, 失败返回error
     */
    @PostMapping("/add")
    public ResponseEntity<Integer> addBrandDetail(@RequestBody BrandDetailDto brandDetailDto) throws ServiceException {
        int count = brandDetailService.add(brandDetailDto);
        return ResponseEntity.success(count);
    }

    /**
     * XTL
     * 批量删除
     * @param ids 结果集
     * @return 返回删除的行数, 成功返回大于0, 失败返回error
     */
    @PostMapping("/delete")
    public ResponseEntity<Integer> deleteBath(@RequestParam List<Integer> ids) throws ServiceException {
        int count = brandDetailService.deleteBath(ids);
        return ResponseEntity.success(count);
    }

    /**
     * XTL
     * 删除
     * @param id 传入要删除的商品ID
     * @return 返回删除的行数, 成功返回1, 失败返回error
     */
    @PostMapping("/del")
    public ResponseEntity<Integer> deleteById(@RequestParam Integer id) throws ServiceException {
        int count = brandDetailService.deleteById(id);
        return ResponseEntity.success(count);
    }

    /**
     * XTL
     * 更新商品
     * @param id 传入更新的商品ID
     * @param brandDetailDto 传入更新的商品详情对象
     * @return 更新成功返回1, 失败返回error
     */
    @PostMapping("/update")
    public ResponseEntity<Integer> modifyBrandDetail(@RequestParam int id, @RequestBody BrandDetailDto brandDetailDto) throws ServiceException {
        int count = brandDetailService.updateBrandDetail(id, brandDetailDto);
        return ResponseEntity.success(count);
    }

    /**
     * XTL
     * 封禁
     * @param id 传入需要禁用或启用的商品ID
     * @return 成功禁用或启用返回1, 失败返回error
     */
    @PostMapping("/banned")
    public ResponseEntity<Integer> modifyBannedById(@RequestParam int id) throws ServiceException {
        int count = brandDetailService.updateBannedById(id);
        return ResponseEntity.success(count);
    }
}
