package com.qfedu.mapper;

import com.qfedu.domain.entity.BrandDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BrandDetailMapper {

    /**
     * 显示该品牌所有商品
     * @param id 品牌id
     * @param page 分页页数
     * @param size 分页显示数量
     * @return 返回查询所有品牌的结果集
     */
    List<BrandDetail> selectAllById(@Param("id") int id, @Param("page") int page, @Param("size") int size);

    /**
     * 添加品牌
     * @param brandDetail
     * @return 返回添加品牌影响的行数
     */
    int insertProduct(@Param("brandDetail") BrandDetail brandDetail);

    /**
     * 批量删除
     * @param pid 批量删除的商品id的集合
     * @return 返回影响的行数
     */
    int deleteBath(@Param("pid") List<Integer> pid);

    /**
     * 删除一个商品
     * @param proId 商品id
     * @return 影响的行数
     */
    int deleteById(@Param("proId") int proId);

    /**
     * 修改商品信息
     * @param brandDetail 商品信息
     * @return 影响的行数
     */
    int updateBrand(@Param("brandDetail") BrandDetail brandDetail);

    /**
     * 封禁商品
     * @param proId 商品id
     * @param status 商品状态
     * @return 影响的行数
     */
    int updateBannedById(@Param("pid") int pid, @Param("status") int status);

    /**
     * 查询某商品的详细信息
     * @param proId 商品id
     * @return 商品的对象
     */
    BrandDetail selectById(@Param("proId") int proId);
}