package com.hyfly.milet.shop.db.service;

import com.hyfly.milet.shop.common.dto.CreateCategoryDto;
import com.hyfly.milet.shop.common.vo.ProductCategoryVo;

public interface ProductCategoryService {

    ProductCategoryVo getProductCategory(Short id);
    
    int createProductCategory(CreateCategoryDto dto);

}
