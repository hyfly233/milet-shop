package com.hyfly.milet.shop.common.annotation;

import com.hyfly.milet.shop.common.enums.SensitiveEnum;

import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SensitiveField {

    /**
     * 不同类型处理不同
     *
     * @return
     */
    SensitiveEnum type() default SensitiveEnum.ENCODE;
}