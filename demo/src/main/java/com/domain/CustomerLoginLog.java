package com.domain;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户登陆日志表
    */
@Data
@Builder
public class CustomerLoginLog {
    /**
    * 登陆日志ID
    */
    private Integer loginId;

    /**
    * 登陆用户ID
    */
    private Integer customerId;

    /**
    * 用户登陆时间
    */
    private Date loginTime;

    /**
    * 登陆IP
    */
    private Integer loginIp;

    /**
    * 登陆类型：0未成功，1成功
    */
    private Byte loginType;
}