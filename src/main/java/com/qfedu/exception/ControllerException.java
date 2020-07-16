package com.qfedu.exception;

import com.qfedu.utils.ErrorStatus;
import lombok.Data;

/**
 * @author FUTURE
 */
@Data
public class ControllerException extends RuntimeException {
    private Integer status;
    private String msg;

    //实际开发终不悔用到这种赋初值方式,因为是魔术代码,只会用到下面的方式
    public ControllerException(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ControllerException(ErrorStatus statu) {
        this.status = statu.getStatus();
        this.msg = statu.getMsg();
    }
}
