package com.qfedu.utils;

import lombok.Data;

/**
 * @Author: Jesse Y
 * @Data: 2020-07-07 15:24
 */
@Data
public class ResponseEntity<T> {
    /**
     * 状态码
     */
    private int status;

    /**
     * 提示消息
     */
    private String msg;

    /**
     * 要传入的数据, 类型是T, 泛型
     */
    private T data;

    /**
     * 程序运行成功的时候调用的success方法
     *      运行成功时, 直接运行默认的成功状态码20000
     *
     * @param data 传入的数据
     * @param <T> 实际情况传入数据的类型
     * @return 返回一个ResponseEntity对象
     */
    public static <T> ResponseEntity<T> success(T data) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setData(data);
        entity.setMsg(ErrorStatus.SUCCESS.getMsg());
        entity.setStatus(ErrorStatus.SUCCESS.getStatus());
        return entity;
    }

    /**
     * 程序运行成功的时候调用的success方法
     *      运行成功时, 需要传入需要的成功状态码, 比如20001
     *
     * @param data 传入的数据
     * @param status 根据需要传入的运行状态码
     * @param <T> 实际情况传入数据的类型
     * @return 返回一个ResponseEntity对象
     */
    public static <T> ResponseEntity<T> success(ErrorStatus status, T data) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setData(data);
        entity.setMsg(status.getMsg());
        entity.setStatus(status.getStatus());
        return entity;
    }

    /**
     * 程序运行失败的时候调用的默认error方法
     *
     * @param <T> 实际情况数据的类型
     * @return 返回一个ResponseEntity对象
     */
    public static <T> ResponseEntity<T> error() {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setMsg("error");
        entity.setStatus(404);
        return entity;
    }

    /**
     * 程序运行失败的时候调用的error方法
     *      需要根据具体的失败原因传入具体的错误状态码
     *
     * @param <T> 实际情况数据的类型
     * @return 返回一个ResponseEntity对象
     */
    public static <T> ResponseEntity<T> error(ErrorStatus status) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setMsg(status.getMsg());
        entity.setStatus(status.getStatus());
        return entity;
    }
}
