package com.wu.类加载;


public class Node {
    public final static int a = 10;
    static {
        System.out.println("Node lode................");
    }

    public final static void  method(){
        System.out.println("Node.method() >>>>");

    }
}
