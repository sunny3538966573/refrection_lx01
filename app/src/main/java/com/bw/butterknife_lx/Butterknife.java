package com.bw.butterknife_lx;

import android.app.Activity;
import android.view.View;

import com.bw.refrection_lx01.R;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.PublicKey;

/**
 * Created by 1607c王晴
 * date 2019/2/13
 * Describe:
 */
public class Butterknife {
    public static void bind(Activity activity) {
        bdContentView(activity);//绑定布局
        bdView(activity);
    }



    /**
     * 绑定布局
     * @param activity
     */
    private static void bdContentView(Activity activity) {
        //获取字节码
        Class<?> c1=activity.getClass();
        //通过字节码获取类的注解
       ContentView contentView= c1.getAnnotation(ContentView.class);
       if (contentView!=null){
           int layoutId = contentView.value();
           activity.setContentView(layoutId);
           try {
               Method method = c1.getMethod("setContentView", int.class);
               method.invoke(activity,layoutId);
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
    }

    /**
     * 绑定控件
     * @param activity
     */
    private static void bdView(Activity activity) {
        Class<?> c2=activity.getClass();
        Field[] declaredFields = c2.getDeclaredFields();
        if (declaredFields.length>0&&declaredFields!=null){
            for (Field declaredField : declaredFields) {
                try {
                    BindView bindView=declaredField.getAnnotation(BindView.class);
                    if (bindView!=null){
                        int value = bindView.value();
                        View viewById = activity.findViewById(value);
                        declaredField.setAccessible(true);
                        declaredField.set(activity,viewById);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
