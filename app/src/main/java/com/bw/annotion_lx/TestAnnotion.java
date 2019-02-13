package com.bw.annotion_lx;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by 1607c王晴
 * date 2019/2/13
 * Describe:
 */
public class TestAnnotion {
    public static void main(String[] args) {
        //获取类的。。。
        //获取字节码
        Class c1=Person.class;
        //通过字节码获取到注解对象
         MyAnnotation myAnnotation= (MyAnnotation) c1.getAnnotation(MyAnnotation.class);
         //判空
        if (myAnnotation!=null){
            System.out.println(myAnnotation.age());
        }

        //获取属/性的name
        try {
            Field field=c1.getField("name");
            MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
            if (annotation!=null){
                System.out.println(annotation.name());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
