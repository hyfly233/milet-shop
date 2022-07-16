package com.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 购物车表
    */
@Data
@Builder
public class OrderCart {
    /**
    * 购物车ID
    */
    private Integer cartId;

    /**
    * 用户ID
    */
    private Integer customerId;

    /**
    * 商品ID
    */
    private Integer productId;

    /**
    * 加入购物车商品数量
    */
    private Integer productAmount;

    /**
    * 商品价格
    */
    private BigDecimal price;

    /**
    * 加入购物车时间
    */
    private Date addTime;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}