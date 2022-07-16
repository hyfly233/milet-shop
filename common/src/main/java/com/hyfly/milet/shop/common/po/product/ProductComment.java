package com.hyfly.milet.shop.common.po.product;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
 * 商品评论表
 */
@Data
@Builder
public class ProductComment {
    /**
     * 评论ID
     */
    private Integer commentId;

    /**
     * 商品ID
     */
    private Integer productId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 用户ID
     */
    private Integer customerId;

    /**
     * 评论标题
     */
    private String title;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 审核状态：0未审核，1已审核
     */
    private Byte auditStatus;

    /**
     * 评论时间
     */
    private Date auditTime;

    /**
     * 最后修改时间
     */
    private Date modifiedTime;
}