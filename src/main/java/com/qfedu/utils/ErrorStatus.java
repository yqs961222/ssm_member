package com.qfedu.utils;

import lombok.Data;


/**
 * @author FUTURE
 */

public enum ErrorStatus {
    SUCCESS(20000,"success","发送成功"),
    NO_DATA(40008, "data not found", "没有相关记录"),
    SERVICE_ERROR(40001,"service error","数据异常请稍后再试"),
    DAO_ERROR(40001,"dao error","数据异常请稍后再试"),
    SYS_ERROR(40004,"system error","系统繁忙,请稍后再试"),
    POST_SUCCESS(20001,"post success","提交数据成功"),
    GET_SUCCESS(20001,"get success","提交数据成功"),
    UPDATE_ERROR(40003, "stock error", "更新失败"),
    CONTROLLER_ERROR(40001,"controller error","数据异常请稍后再试");
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
}
