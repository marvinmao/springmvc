package com.mvn.marvinmao.annotation;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MarvinRequestHeader {
    String value() default "";
}
