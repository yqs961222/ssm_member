package com.qfedu.utils;

public enum ErrorStatus {
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

    public String getTip() {
        return tip;
    }

    ErrorStatus(int status, String msg, String tip) {
        this.status = status;
        this.msg = msg;
        this.tip = tip;
    }
}
