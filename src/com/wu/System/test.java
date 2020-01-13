package com.wu.System;

public class test {
    public static void main(String[] args) {
        int a = 10 , b = 10;
        long t1 = System.currentTimeMillis();
        a  = a+b;
        long  t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

    }
}
