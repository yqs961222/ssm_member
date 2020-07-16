package com.qfedu.handler;

import com.qfedu.exception.DaoException;
import com.qfedu.exception.ServiceException;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author FUTURE
 * 这里的异常是给页面发送的异常,只能捕获到控制层的异常和其他抛到控制层的异常
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseUtils handlerException() {

        return ResponseUtils.error(ErrorStatus.SYS_ERROR);
    }

    @ExceptionHandler(ServiceException.class)
    public ResponseUtils handlerServiceException() {


        return ResponseUtils.error(ErrorStatus.SERVICE_ERROR);
    }

    @ExceptionHandler(DaoException.class)
    public ResponseUtils handlerDaoException() {
        return ResponseUtils.error(ErrorStatus.DAO_ERROR);
    }
}
