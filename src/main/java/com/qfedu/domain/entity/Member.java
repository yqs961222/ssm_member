package com.qfedu.domain.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author FUTURE
 */
@Data
public class Member implements Serializable {
    /**
    * 会员id
    */
    private Integer memberId;

    /**
    * 用户名
    */
    private String memberName;

    /**
    * 用户密码
    */
    private String memberPassword;

    /**
    * 用户电话
    */
    private String memberPhone;

    /**
    * 用户邮箱
    */
    private String memberEmail;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 0表示用户激活
    */
    private Integer status;
}