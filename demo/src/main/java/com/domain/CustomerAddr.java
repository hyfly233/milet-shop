package com.domain;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户地址表
    */
@Data
@Builder
public class CustomerAddr {
    /**
    * 自增主键ID
    */
    private Integer customerAddrId;

    /**
    * customer_login表的自增ID
    */
    private Integer customerId;

    /**
    * 邮编
    */
    private Short zip;

    /**
    * 地区表中省份的ID
    */
    private Short province;

    /**
    * 地区表中城市的ID
    */
    private Short city;

    /**
    * 地区表中的区ID
    */
    private Short district;

    /**
    * 具体的地址门牌号
    */
    private String address;

    /**
    * 是否默认
    */
    private Byte isDefault;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}