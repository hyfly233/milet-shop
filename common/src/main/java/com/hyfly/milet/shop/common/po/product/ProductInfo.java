package com.hyfly.milet.shop.common.po.product;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
 * 商品信息表
 */
@Data
@Builder
public class ProductInfo {
    /**
     * 商品ID
     */
    private Integer productId;

    /**
     * 商品编码
     */
    private String productCore;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 国条码
     */
    private String barCode;

    /**
     * 品牌表的ID
     */
    private Integer brandId;

    /**
     * 一级分类ID
     */
    private Short oneCategoryId;

    /**
     * 二级分类ID
     */
    private Short twoCategoryId;

    /**
     * 三级分类ID
     */
    private Short threeCategoryId;

    /**
     * 商品的供应商ID
     */
    private Integer supplierId;

    /**
     * 商品销售价格
     */
    private BigDecimal price;

    /**
     * 商品加权平均成本
     */
    private BigDecimal averageCost;

    /**
     * 上下架状态：0下架1上架
     */
    private Byte publishStatus;

    /**
     * 审核状态：0未审核，1已审核
     */
    private Byte auditStatus;

    /**
     * 商品重量
     */
    private Double weight;

    /**
     * 商品长度
     */
    private Double length;

    /**
     * 商品高度
     */
    private Double height;

    /**
     * 商品宽度
     */
    private Double width;

    private Object colorType;

    /**
     * 生产日期
     */
    private Date productionDate;

    /**
     * 商品有效期
     */
    private Integer shelfLife;

    /**
     * 商品描述
     */
    private String descript;

    /**
     * 商品录入时间
     */
    private Date indate;

    /**
     * 最后修改时间
     */
    private Date modifiedTime;
}