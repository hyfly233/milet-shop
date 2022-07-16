package com.domain;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户级别信息表
    */
@Data
@Builder
public class CustomerLevelInf {
    /**
    * 会员级别ID
    */
    private Byte customerLevel;

    /**
    * 会员级别名称
    */
    private String levelName;

    /**
    * 该级别最低积分
    */
    private Integer minPoint;

    /**
    * 该级别最高积分
    */
    private Integer maxPoint;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}