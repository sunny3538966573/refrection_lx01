package com.bw.annotion_lx;

/**
 * Created by 1607c王晴
 * date 2019/2/13
 * Describe:
 */
@MyAnnotation(name = "aaa", age = 12)
public class Person {
    @MyAnnotation(name="bbb" , age = 10)
    public String name;
    public int age;

    @MyAnnotation(name = "张三",age = 18)
    public void fun(String name,int age){

    }
}
