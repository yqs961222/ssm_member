package com.qfedu.utils;

import lombok.Data;

@Data
public class ResponseUtils<T> {
    private Integer status;
    private String msg;
    private T data;


    public static <T> ResponseUtils<T> success(ErrorStatus status, T data) {
        ResponseUtils<T> responseUtils = new ResponseUtils<>();
        responseUtils.setMsg(status.getMsg());
        responseUtils.setStatus(status.getStatus());
        responseUtils.setData(data);
        return responseUtils;
    }

    public static <T> ResponseUtils<T> success(ErrorStatus status) {
        ResponseUtils<T> responseUtils = new ResponseUtils<>();
        responseUtils.setMsg(status.getMsg());
        responseUtils.setStatus(status.getStatus());
        return responseUtils;
    }

    public static <T> ResponseUtils<T> error(ErrorStatus status, T data) {
        ResponseUtils<T> responseUtils = new ResponseUtils<>();
        responseUtils.setMsg(status.getMsg());
        responseUtils.setStatus(status.getStatus());
        responseUtils.setData(data);
        return responseUtils;
    }

    public static <T> ResponseUtils<T> error(ErrorStatus status) {
        ResponseUtils<T> responseUtils = new ResponseUtils<>();
        responseUtils.setMsg(status.getMsg());
        responseUtils.setStatus(status.getStatus());
        return responseUtils;
    }
}

