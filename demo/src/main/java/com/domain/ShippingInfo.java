package com.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 物流公司信息表
    */
@Data
@Builder
public class ShippingInfo {
    /**
    * 主键ID
    */
    private Byte shipId;

    /**
    * 物流公司名称
    */
    private String shipName;

    /**
    * 物流公司联系人
    */
    private String shipContact;

    /**
    * 物流公司联系电话
    */
    private String telephone;

    /**
    * 配送价格
    */
    private BigDecimal price;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}