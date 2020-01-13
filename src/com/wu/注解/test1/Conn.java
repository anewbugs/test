package com.wu.注解.test1;

import java.lang.reflect.Method;

public class Conn extends Service{



//
//    public void startup() {
//        scheduleInit();
//    }
//
//    protected  void scheduleInit(){
//        Method[] methods = getClass().getMethods();
//        for (Method method : methods) {
//            if (!method.isAnnotationPresent(Schedule.class)) continue;
//
//            scheMethods.add(method);
//        }
//    }

    @Schedule
    public void Method1(){
        System.out.println("1");
    }
    @Schedule
    public void Method2(){
        System.out.println("2");
    }
    @Schedule
    public void Method3(){
        System.out.println("3");
    }



    public void Method4(){
        System.out.println("4");
    }

    public void Method5(){
        System.out.println("5");
    }
}
