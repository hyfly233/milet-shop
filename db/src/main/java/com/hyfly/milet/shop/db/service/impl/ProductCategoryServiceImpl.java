package com.hyfly.milet.shop.db.service.impl;

import com.hyfly.milet.shop.common.dto.CreateCategoryDto;
import com.hyfly.milet.shop.common.enums.CategoryStatusEnum;
import com.hyfly.milet.shop.common.po.product.ProductCategory;
import com.hyfly.milet.shop.common.vo.ProductCategoryVo;
import com.hyfly.milet.shop.db.dao.product.ProductCategoryMapper;
import com.hyfly.milet.shop.db.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    ProductCategoryMapper categoryMapper;


    @Override
    public ProductCategoryVo getProductCategory(Short id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int createProductCategory(CreateCategoryDto dto) {

        ProductCategory category = CreateCategoryDto.invert(dto);
        // todo 雪花算法生成 id
        category.setModifiedTime(new Date());
        category.setCategoryStatus(CategoryStatusEnum.AVAILABLE.getVal());
        return categoryMapper.insert(category);
    }

}
