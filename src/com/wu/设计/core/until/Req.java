package com.wu.设计.core.until;


public class Req {
    public  enum Req_Type {
        RPC,
        RETURN,
        PING;

    }
    /**请求类型*/
    public Req_Type type ;

}
