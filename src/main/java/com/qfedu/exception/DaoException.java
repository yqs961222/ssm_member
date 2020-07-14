package com.qfedu.exception;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-09 16:36
 */
public class DaoException extends RuntimeException {
    private String msg;
    private int status;

    public DaoException(String message, int status) {
        this.msg = message;
        this.status = status;
    }
}
