package com.hyfly.milet.shop.db.controller;

import com.hyfly.milet.shop.common.dto.CreateCategoryDto;
import com.hyfly.milet.shop.common.vo.ProductCategoryVo;
import com.hyfly.milet.shop.common.vo.ResultVo;
import com.hyfly.milet.shop.db.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product/category")
public class ProductCategoryController {

    @Autowired
    ProductCategoryService categoryService;

    @GetMapping("/{id}")
    public ResultVo<ProductCategoryVo> category(@PathVariable("id") String id) {
        return new ResultVo<>(categoryService.getProductCategory(id));
    }


    /**
     * 创建商品分类表
     *
     * @return ResultVo
     */
    @PostMapping
    public ResultVo<String> create(CreateCategoryDto dto) {
        int i = categoryService.createProductCategory(dto);

        // todo
        return new ResultVo<>(i > 0 ? "创建成功" : "创建失败");
    }
}
