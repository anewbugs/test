package com.wu.设计模式.代理.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NormalHandkler implements InvocationHandler {
    private Object target;

    public NormalHandkler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("man say invoked: " + System.currentTimeMillis());
        method.invoke(target,args);
        return  null;
    }
}
