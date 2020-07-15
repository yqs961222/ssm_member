package com.qfedu.mapper;

import com.qfedu.domain.dto.ProDetailDto;
import com.qfedu.exception.DaoException;

import java.util.List;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-15 19:57
 */
public interface ProDetailDtoMapper {
    /**
     * 查询到对象proId的商品的详情表
     */
    ProDetailDto selectByProId(Integer proId) throws DaoException;
}
