package com.wu.设计;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * 业务Class
 */
public abstract class Service {
    /**
     * 初始化远程调用方法
     * @param hashMap
     * @param clazz
     */
    public static void init(HashMap hashMap,Class clazz){
        //反射获取类方法集
        Method[] functions = clazz.getDeclaredMethods();

        for (Method method: functions) {
            if (method.isAnnotationPresent(RemoteMethod.class)){
                RemoteMethod remoteMethod = method.getAnnotation(RemoteMethod.class);
                hashMap.put(remoteMethod.functionKey(),method);
            }
        }
    }

    public void testS(){
        System.out.println(getClass().getName());
    }

}
