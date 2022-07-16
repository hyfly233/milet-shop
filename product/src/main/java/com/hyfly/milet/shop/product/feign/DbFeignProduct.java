package com.hyfly.milet.shop.product.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Component
@FeignClient
@RequestMapping
public interface DbFeignProduct {

}
