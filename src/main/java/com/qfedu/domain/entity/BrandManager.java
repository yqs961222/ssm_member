package com.qfedu.domain.entity;

import java.util.Date;

/**
 * 品牌管理表
 */
public class BrandManager {
    /**
     * 品牌ID
     */
    private Integer id;

    /**
     * 品牌logo
     */
    private String brandLogo;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 国家地区
     */
    private String country;

    /**
     * 品牌描述
     */
    private String description;

    /**
     * 品牌加入商城的时间
     */
    private Date joinTime;

    /**
     * 状态码, 1 启用, 0 禁用
     */
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}