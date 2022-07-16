package com.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 订单详情表
    */
@Data
@Builder
public class OrderDetail {
    /**
    * 订单详情表ID
    */
    private Integer orderDetailId;

    /**
    * 订单表ID
    */
    private Integer orderId;

    /**
    * 订单商品ID
    */
    private Integer productId;

    /**
    * 商品名称
    */
    private String productName;

    /**
    * 购买商品数量
    */
    private Integer productCnt;

    /**
    * 购买商品单价
    */
    private BigDecimal productPrice;

    /**
    * 平均成本价格
    */
    private BigDecimal averageCost;

    /**
    * 商品重量
    */
    private Double weight;

    /**
    * 优惠分摊金额
    */
    private BigDecimal feeMoney;

    /**
    * 仓库ID
    */
    private Integer wId;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}