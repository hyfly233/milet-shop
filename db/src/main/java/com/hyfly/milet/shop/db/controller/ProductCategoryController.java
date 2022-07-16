package com.hyfly.milet.shop.db.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/category")
public class ProductCategoryController {

    @GetMapping("/test")
    public String test() {
        return "hello";
    }
}
