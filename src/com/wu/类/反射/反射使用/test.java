package com.wu.类.反射.反射使用;

import java.lang.reflect.Method;

public class test {
    public static void main(String[] args) {
        Object o = new F();

        Method[] methods = F.class.getDeclaredMethods();
        Method method = methods[0];
        method.setAccessible( true );
        try{
            Object r = method.invoke( o, 22 );
            System.out.println(r);
        }catch (Exception e){}


    }
}
