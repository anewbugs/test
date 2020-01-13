package com.wu.设计;

import java.lang.reflect.Method;
import java.util.HashMap;

public class Connection extends Service {

    /**远程调用key**/
    public final static int CONNECTION_SEND = 1;   //消息发送

    /****/


    private static final HashMap<Integer, Method> functions = new HashMap();

    static {
         init(functions,Connection.class);
     }



    @DistrMethod(functionKey = CONNECTION_SEND)
    private void Send(){}

}
