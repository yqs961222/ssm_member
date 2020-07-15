package com.qfedu.exception;

import com.qfedu.utils.ErrorStatus;
import lombok.Data;

@Data
public class DaoException extends RuntimeException{
    private Integer status;
    private String msg;

    public DaoException(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public DaoException(ErrorStatus statu) {
        this.status = statu.getStatus();
        this.msg = statu.getMsg();
    }
}
