package com.domain;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 品牌信息表
    */
@Data
@Builder
public class BrandInfo {
    /**
    * 品牌ID
    */
    private Short brandId;

    /**
    * 品牌名称
    */
    private String brandName;

    /**
    * 联系电话
    */
    private String telephone;

    /**
    * 品牌网络
    */
    private String brandWeb;

    /**
    * 品牌logo URL
    */
    private String brandLogo;

    /**
    * 品牌描述
    */
    private String brandDesc;

    /**
    * 品牌状态,0禁用,1启用
    */
    private Byte brandStatus;

    /**
    * 排序
    */
    private Byte brandOrder;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}