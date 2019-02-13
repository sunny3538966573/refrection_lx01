package com.bw.bean;

/**
 * Created by 1607c王晴
 * date 2019/2/13
 * Describe:
 */
public class Person {
    //私有属性
    private String name;
    public int age;
    //公共的属性
    public String sex;

    public Person() {
        System.out.println("无参构造器");
    }

    private Person(String name, int age, String sex) {
        System.out.println("私有构造器name=" + name + "    age=" + age + "     sex=" + sex);
    }

    public void fun() {
        System.out.println("方法中name=" + name);
    }

    private void fun1(String name, int age) {
        System.out.println("name"+name+"   age="+age);
    }

}
