package com.qfedu.exception;

import com.qfedu.utils.ErrorStatus;
import lombok.Data;

/**
 * @author FUTURE
 */
@Data
public class ServiceException extends RuntimeException{
    private Integer status;
    private String msg;

    public ServiceException(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ServiceException(ErrorStatus statu) {
        this.status = statu.getStatus();
        this.msg = statu.getMsg();
    }
}
