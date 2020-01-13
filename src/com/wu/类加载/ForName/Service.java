package com.wu.类加载.ForName;

import java.lang.reflect.Constructor;

public abstract class Service {
    private Servicebase servicebase;

    public <T> T getMethodFunction(int funcKey) {
        try {
            if (servicebase == null) {
                Class<?> cls = Class.forName(getClass().getName() + "Impl");
                Constructor<?> c = cls.getDeclaredConstructor();
                c.setAccessible(true);
                servicebase = (Servicebase) c.newInstance();
            }

            // 通过代理类 获取函数引用
            return servicebase.getMethodFunction(this, funcKey);
        } catch (Exception e) {

        }

        return null;
    }
}

