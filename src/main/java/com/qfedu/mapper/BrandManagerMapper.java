package com.qfedu.mapper;


import com.qfedu.domain.entity.Brand;
import com.qfedu.exception.DaoException;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author FUTURE
 */
@Mapper
public interface BrandManagerMapper {
    /**
     * 根据商品名和上架时间查询
     * @return 返回查询的商品对象
     */
    List<Brand> selectByNameAndTime(@Param("brand") Brand brand) throws DaoException;

    /**
     * 通过商品id,国家,品牌查询---精确查询
     * @param brand
     * @return
     * @throws DaoException
     */
    Brand selectById(@Param("brand") Brand brand) throws DaoException;

    /**
     * 添加商品
     * @param brand
     * @return
     */
    int insert(@Param("brand") Brand brand) throws DaoException;

    /**
     * 分页查询
     * @param limit
     * @param offset
     * @return
     */
    List<Brand> selectByBatch(@Param("limit") int limit,@Param("offset") int offset) throws DaoException;

    /**
     *批量删除
     * @param brandId
     * @return
     */
    int update(@Param("brandId") List<Integer> brandId) throws DaoException;

    /**
     * 根据国家查询
     * @return
     */
    List<Brand> selectByCountry(@Param("country") String  country) throws DaoException;



}