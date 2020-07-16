package com.qfedu.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class BrandDetailDto implements Serializable {

    private String brandName;
    private String proName;
    private BigDecimal oldPrice;
    private BigDecimal newPrice;
    private Date releaseTime;
    private int examine;
    private int status;
    private String attribute;

}
