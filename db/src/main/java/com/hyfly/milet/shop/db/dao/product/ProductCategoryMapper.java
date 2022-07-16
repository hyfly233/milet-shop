package com.hyfly.milet.shop.db.dao.product;

import com.hyfly.milet.shop.common.po.product.ProductCategory;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Short categoryId);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Short categoryId);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
}