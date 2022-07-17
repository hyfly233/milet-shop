package com.hyfly.milet.shop.common.dto;

import com.hyfly.milet.shop.common.po.product.ProductCategory;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class CreateCategoryDto {
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

    public static ProductCategory invert(@NonNull CreateCategoryDto dto) {
        return ProductCategory.builder()
                .categoryName(dto.getCategoryName())
                .categoryCode(dto.getCategoryCode())
                .parentId(dto.getParentId())
                .categoryLevel(dto.getCategoryLevel())
                .build();
    }
}
