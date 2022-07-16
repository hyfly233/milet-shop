package com.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 商品库存表
    */
@Data
@Builder
public class WarehouseProduct {
    /**
    * 商品库存ID
    */
    private Integer wpId;

    /**
    * 商品ID
    */
    private Integer productId;

    /**
    * 仓库ID
    */
    private Short wId;

    /**
    * 当前商品数量
    */
    private Integer currentCnt;

    /**
    * 当前占用数据
    */
    private Integer lockCnt;

    /**
    * 在途数据
    */
    private Integer inTransitCnt;

    /**
    * 移动加权成本
    */
    private BigDecimal averageCost;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}