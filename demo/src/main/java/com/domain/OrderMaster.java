package com.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 订单主表
    */
@Data
@Builder
public class OrderMaster {
    /**
    * 订单ID
    */
    private Integer orderId;

    /**
    * 订单编号 yyyymmddnnnnnnnn
    */
    private Long orderSn;

    /**
    * 下单人ID
    */
    private Integer customerId;

    /**
    * 收货人姓名
    */
    private String shippingUser;

    /**
    * 省
    */
    private Short province;

    /**
    * 市
    */
    private Short city;

    /**
    * 区
    */
    private Short district;

    /**
    * 地址
    */
    private String address;

    /**
    * 支付方式：1现金，2余额，3网银，4支付宝，5微信
    */
    private Byte paymentMethod;

    /**
    * 订单金额
    */
    private BigDecimal orderMoney;

    /**
    * 优惠金额
    */
    private BigDecimal districtMoney;

    /**
    * 运费金额
    */
    private BigDecimal shippingMoney;

    /**
    * 支付金额
    */
    private BigDecimal paymentMoney;

    /**
    * 快递公司名称
    */
    private String shippingCompName;

    /**
    * 快递单号
    */
    private String shippingSn;

    /**
    * 下单时间
    */
    private Date createTime;

    /**
    * 发货时间
    */
    private Date shippingTime;

    /**
    * 支付时间
    */
    private Date payTime;

    /**
    * 收货时间
    */
    private Date receiveTime;

    /**
    * 订单状态
    */
    private Byte orderStatus;

    /**
    * 订单积分
    */
    private Integer orderPoint;

    /**
    * 发票抬头
    */
    private String invoiceTime;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}