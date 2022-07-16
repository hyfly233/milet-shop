package com.domain;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户积分日志表
    */
@Data
@Builder
public class CustomerPointLog {
    /**
    * 积分日志ID
    */
    private Integer pointId;

    /**
    * 用户ID
    */
    private Integer customerId;

    /**
    * 积分来源：0订单，1登陆，2活动
    */
    private Byte source;

    /**
    * 积分来源相关编号
    */
    private Integer referNumber;

    /**
    * 变更积分数
    */
    private Short changePoint;

    /**
    * 积分日志生成时间
    */
    private Date createTime;
}