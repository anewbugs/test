package com.wu.类加载;

public class Main {
    static {
        System.out.println("Main load...........");
    }
    public static void main(String[] args) {
        System.out.println(Node.a);
        Node.method();
    }
}
