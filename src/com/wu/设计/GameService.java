package com.wu.设计;

import java.lang.reflect.Method;
import java.util.HashMap;

public class GameService extends Service {

    /**远程调用key**/
    public final static int MSG_HANDER = 1;   //消息发送
    public final static int TEST = 2; //测试用类
    /****/
    private static final HashMap<Integer, Method> functions = new HashMap();

    static {
        init(functions,GameService.class);
    }

    @RemoteMethod(functionKey = MSG_HANDER)
    private void msgHander(){}
    @RemoteMethod(functionKey = TEST)
    private void test(){}

    public void prit(){
        System.out.println(functions);
        testS();
    }
}
