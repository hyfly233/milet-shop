package com.hyfly.milet.shop.db.dao.product;

import com.hyfly.milet.shop.common.po.product.ProductComment;

public interface ProductCommentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(ProductComment record);

    int insertSelective(ProductComment record);

    ProductComment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(ProductComment record);

    int updateByPrimaryKey(ProductComment record);
}