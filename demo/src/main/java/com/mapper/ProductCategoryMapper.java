package com.mapper;

import com.domain.ProductCategory;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Short categoryId);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Short categoryId);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
}