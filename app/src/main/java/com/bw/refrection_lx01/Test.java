package com.bw.refrection_lx01;

import com.bw.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by 1607c王晴
 * date 2019/2/13
 * Describe:
 */
public class Test {

    private static Constructor constructor;
    private static Person person2;

    public static void main(String[] args) {
        //java反射机制是在运行状态中，反射类的基础用来描述java类的类就是class这个类
        //class字节码的获取
        // 第一种：类名.class
        Class c1 = Person.class;
        //第二种:对象.getClass
        Person person = new Person();
        Class c2 = person.getClass();
        //第三种
        try {
            Class c3 = Class.forName("com.bw.refrection_lx01.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取构造器
        try {
            constructor = c2.getConstructor(null);
            Person personconstructor = (Person) constructor.newInstance(null);
            personconstructor.fun();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //获取成员变量
        try {
            Field field=c1.getDeclaredField("name");
            field.setAccessible(true);
            field.set(Person.class.newInstance(),"星星");
            person2 = (Person) constructor.newInstance(null);
            field.set(person2,"星星");
            person2.fun();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取方法
        try {
           // Method method =c1.getMethod("fun",null);
           // method.invoke(person2,null);
            Method method =c1.getDeclaredMethod("fun1", String.class, int.class);
            method.setAccessible(true);
            method.invoke(person2,"张三",12);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
