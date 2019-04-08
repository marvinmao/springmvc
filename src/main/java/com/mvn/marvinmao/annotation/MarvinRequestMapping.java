package com.mvn.marvinmao.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MarvinRequestMapping {
    //路径EnjoyRequestMapping(value)
    String value() default "";
}
