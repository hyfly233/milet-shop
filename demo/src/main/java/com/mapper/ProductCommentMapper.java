package com.mapper;

import com.domain.ProductComment;

public interface ProductCommentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(ProductComment record);

    int insertSelective(ProductComment record);

    ProductComment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(ProductComment record);

    int updateByPrimaryKey(ProductComment record);
}