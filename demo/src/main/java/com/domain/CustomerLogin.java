package com.domain;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户登录表
    */
@Data
@Builder
public class CustomerLogin {
    /**
    * 用户ID
    */
    private Integer customerId;

    /**
    * 用户登录名
    */
    private String loginName;

    /**
    * md5加密的密码
    */
    private String password;

    /**
    * 用户状态
    */
    private Byte userStats;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}