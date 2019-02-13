package com.bw.refrection_lx01;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1607c王晴
 * date 2019/2/13
 * Describe:
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1111);
        Class<?> clist=list.getClass();
        try {
            Method method=clist.getMethod("add",Object.class);
            method.invoke(list,"aaa");
            method.invoke(list,true);
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
