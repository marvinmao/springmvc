package com.mvn.marvinmao.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MarvinQualifier {
    String value() default "";
}
