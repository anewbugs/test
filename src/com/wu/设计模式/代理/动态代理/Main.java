package com.wu.设计模式.代理.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        Iperson man = new Man();
        InvocationHandler handler = new NormalHandkler(man);
        Iperson proay = (Iperson)Proxy.newProxyInstance(Man.class.getClassLoader(),Man.class.getInterfaces(),handler);
        proay.say();;


    }
}
