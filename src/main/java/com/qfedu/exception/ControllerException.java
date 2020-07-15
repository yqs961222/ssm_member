package com.qfedu.exception;

import com.qfedu.utils.ErrorStatus;
import lombok.Data;

@Data
public class ControllerException extends RuntimeException{
    private Integer status;
    private String msg;

    public ControllerException(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ControllerException(ErrorStatus statu) {
        this.status = statu.getStatus();
        this.msg = statu.getMsg();
    }
}
