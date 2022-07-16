package com.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户信息表
    */
@Data
@Builder
public class CustomerInf {
    /**
    * 自增主键ID
    */
    private Integer customerInfId;

    /**
    * customer_login表的自增ID
    */
    private Integer customerId;

    /**
    * 用户真实姓名
    */
    private String customerName;

    /**
    * 证件类型：1 身份证，2 军官证，3 护照
    */
    private Byte identityCardType;

    /**
    * 证件号码
    */
    private String identityCardNo;

    /**
    * 手机号
    */
    private Integer mobilePhone;

    /**
    * 邮箱
    */
    private String customerEmail;

    /**
    * 性别
    */
    private String gender;

    /**
    * 用户积分
    */
    private Integer userPoint;

    /**
    * 注册时间
    */
    private Date registerTime;

    /**
    * 会员生日
    */
    private Date birthday;

    /**
    * 会员级别：1 普通会员，2 青铜，3白银，4黄金，5钻石
    */
    private Byte customerLevel;

    /**
    * 用户余额
    */
    private BigDecimal userMoney;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}