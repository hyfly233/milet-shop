package com.hyfly.milet.shop.product.service.impl;

import com.hyfly.milet.shop.product.feign.DbFeignProduct;
import com.hyfly.milet.shop.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    DbFeignProduct feignProduct;
}
