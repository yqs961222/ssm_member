package com.qfedu.handler;

import com.qfedu.exception.DaoException;
import com.qfedu.exception.ServiceException;
import com.qfedu.utils.ErrorStatus;
import com.qfedu.utils.ResponseUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseUtils handlerException() {
     return ResponseUtils.error(ErrorStatus.SYS_ERROR);
    }
    @ExceptionHandler(ServiceException.class)
    public ResponseUtils handlerServiceException(ServiceException daoException) {
        return ResponseUtils.error(ErrorStatus.SERVICE_ERROR);
    }
    @ExceptionHandler(DaoException.class)
    public ResponseUtils handlerDaoException(DaoException daoException) {
        return ResponseUtils.error(ErrorStatus.DAO_ERROR);
    }
}
