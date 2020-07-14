package com.qfedu.utils;

import lombok.Data;


public enum ErrorStatus {
    SUUESS(20000,"success","发送成功"),
    SERVICE_ERROR(40001,"service error","数据异常请稍后再试"),
    DAO_ERROR(40001,"dao error","数据异常请稍后再试"),
    SYS_ERROR(40004,"system error","系统繁忙,请稍后再试"),
    POST_SUCCESS(20001,"post success","提交数据成功");
    private Integer status;
    private String msg;
    private String tip;

    ErrorStatus(Integer status, String msg, String tip) {
        this.status = status;
        this.msg = msg;
        this.tip = tip;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

public enum ErrorStatus {
    NO_DATA(40008, "data not found", "没有相关记录"),
    SUCCESS(20000, "success", "成功"),
    POST_SUCCESS(20001, "success", "提交数据成功"),
    SERVICE_ERROR(40001, "service error", "数据异常, 请重新再试!"),
    DAO_ERROR(40002, "dao error", "数据层异常"),
    UPDATE_ERROR(40003, "stock error", "更新失败"),
    SYS_ERROR(40004, "system error", "系统繁忙, 请重新再试!");


    int status;
    String msg;
    String tip;

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }

    ErrorStatus(int status, String msg, String tip) {
        this.status = status;
        this.msg = msg;
    }
}
