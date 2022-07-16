package com.hyfly.milet.shop.common.po.product;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
 * 商品分类表
 */
@Data
@Builder
public class ProductCategory {
    /**
     * 分类ID
     */
    private Short categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类编码
     */
    private String categoryCode;

    /**
     * 父分类ID
     */
    private Short parentId;

    /**
     * 分类层级
     */
    private Byte categoryLevel;

    /**
     * 分类状态
     */
    private Byte categoryStatus;

    /**
     * 最后修改时间
     */
    private Date modifiedTime;
}