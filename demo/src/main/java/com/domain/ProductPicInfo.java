package com.domain;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 商品图片信息表
    */
@Data
@Builder
public class ProductPicInfo {
    /**
    * 商品图片ID
    */
    private Integer productPicId;

    /**
    * 商品ID
    */
    private Integer productId;

    /**
    * 图片描述
    */
    private String picDesc;

    /**
    * 图片URL
    */
    private String picUrl;

    /**
    * 是否主图：0.非主图1.主图
    */
    private Byte isMaster;

    /**
    * 图片排序
    */
    private Byte picOrder;

    /**
    * 图片是否有效：0无效 1有效
    */
    private Byte picStatus;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}