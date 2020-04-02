package com.wu.jvm.方法调用;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

import static java.lang.invoke.MethodHandles.lookup;


public class MethodHandleTest {
    static class ClassA{
        public void println(String s){
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Throwable{
        //methodhandle
        Object obj = System.currentTimeMillis() % 2 == 0 ? System.out : new ClassA();
        getPrintMH(obj).invokeExact("icyfenix");
        //Reflection
        Method m = obj.getClass().getMethod("println",String.class);
        m.invoke(obj,"icfenix");

    }

    private static MethodHandle getPrintMH(Object reveciver) throws Throwable{
        MethodType mt = MethodType.methodType(void.class,String.class);
        return lookup().findVirtual(reveciver.getClass(),"println",mt).bindTo(reveciver);
    }
}
