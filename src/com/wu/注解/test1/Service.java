package com.wu.注解.test1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class Service {
    /** 缓存本类的调度队列函数 */
    public List<Method> scheMethods = new ArrayList<>();
//
//    public abstract void startup() ;
//
//    protected abstract void scheduleInit();


    public void startup() {
        scheduleInit();
    }

    protected  void scheduleInit(){
        Method[] methods =this.getClass().getMethods();
        for (Method method : methods) {
            if (!method.isAnnotationPresent(Schedule.class)) continue;

            scheMethods.add(method);
        }
    }

    @Override
    public String toString() {
        return "Service{" +
                "scheMethods=" + scheMethods +
                '}';
    }
}
