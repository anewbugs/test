package com.wu.类加载.ForName.Services;

import com.wu.类加载.ForName.Service;
import com.wu.类加载.ForName.Servicebase;

public class ConnectionImpl  extends Servicebase {
    @Override
    public <T> T getMethodFunction(Service serv, int methodKey) {
        System.out.println(this);
        return null;
    }
}
