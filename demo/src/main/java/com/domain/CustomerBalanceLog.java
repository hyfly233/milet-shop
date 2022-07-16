package com.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户余额变动表
    */
@Data
@Builder
public class CustomerBalanceLog {
    /**
    * 余额日志ID
    */
    private Integer balanceId;

    /**
    * 用户ID
    */
    private Integer customerId;

    /**
    * 记录来源：1订单，2退货单
    */
    private Byte source;

    /**
    * 相关单据ID
    */
    private Integer sourceSn;

    /**
    * 记录生成时间
    */
    private Date createTime;

    /**
    * 变动金额
    */
    private BigDecimal amount;
}