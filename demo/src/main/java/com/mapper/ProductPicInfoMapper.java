package com.mapper;

import com.domain.ProductPicInfo;

public interface ProductPicInfoMapper {
    int deleteByPrimaryKey(Integer productPicId);

    int insert(ProductPicInfo record);

    int insertSelective(ProductPicInfo record);

    ProductPicInfo selectByPrimaryKey(Integer productPicId);

    int updateByPrimaryKeySelective(ProductPicInfo record);

    int updateByPrimaryKey(ProductPicInfo record);
}