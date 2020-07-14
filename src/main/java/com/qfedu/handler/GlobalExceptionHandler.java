package com.qfedu.handler;


import com.qfedu.exception.DaoException;
import com.qfedu.exception.ServiceException;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 两个注解
 * 在类上使用 @RestControllerAdvice
 * 在方法上使用 @ExceptionHandler
 *
 * @Author: Jesse Y
 * @Data: 2020-07-09 16:23
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity handlerException(Exception ex) {
        if (ex instanceof ServiceException) {
            return ResponseEntity.error(ErrorStatus.SERVICE_ERROR);
        } else if (ex instanceof DaoException) {
            return ResponseEntity.error(ErrorStatus.DAO_ERROR);
        }
        return ResponseEntity.error();
    }

    /**
     * 可以将异常分为一个个单独的异常
     */
    @ExceptionHandler(DaoException.class)
    public ResponseEntity handlerException(DaoException ex) {
        return ResponseEntity.error(ErrorStatus.DAO_ERROR);
    }
}
