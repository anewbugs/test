package com.wu.观察者模式.代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class testProxy {
    public static void main(String[] args) {
        IRegisterService iRegisterService = new RegisterServiceImpl();
        InsertDataHandler insertDataHandler = new InsertDataHandler();
        IRegisterService proxy = (IRegisterService)insertDataHandler.getProxy(iRegisterService);
        proxy.register("RyanLee", "123");
    }
}


class InsertDataHandler implements InvocationHandler {
    Object obj;

    public Object getProxy(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBefore();
        Object result = method.invoke(obj, args);
        doAfter();
        return result;
    }

    private void doBefore() {
        System.out.println("[Proxy]一些前置处理");
    }

    private void doAfter() {
        System.out.println("[Proxy]一些后置处理");
    }
}
interface IRegisterService {
    void register(String name, String pwd);
}
class RegisterServiceImpl implements IRegisterService {
    @Override
    public void register(String name, String pwd) {
        System.out.println(String.format("【向数据库中插入数据】name：%s，pwd：%s", name, pwd));
    }
}