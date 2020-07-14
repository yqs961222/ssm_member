package com.qfedu.exception;


import com.qfedu.utils.ErrorStatus;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-09 16:36
 */
public class ServiceException extends Exception {
    private String msg;
    private int status;

    public ServiceException(String message, int status) {
        this.msg = message;
        this.status = status;
    }

    public ServiceException(ErrorStatus errorStatus) {
        this.msg = errorStatus.getMsg();
        this.status = errorStatus.getStatus();
    }
}
