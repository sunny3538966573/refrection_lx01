package com.bw.annotion_lx;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 1607c王晴
 * date 2019/2/13
 * Describe:自定义注解练习
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR})
//以下两个不常用
@Documented
@Inherited
public @interface MyAnnotation {
    String name() default "aaa";
    int age() default 12;
}
