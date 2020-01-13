package com.wu.jvm.运行时区域;

import java.util.ArrayList;

public class StackOverflowErrorTest {
    static int a =0;
    public static void main(String[] args) {
        fun();
    }

    public static void fun(){
        //StackOverflowError
//        System.out.println(++a);
//        fun();


        //OutOfMemoryError
        ArrayList<byte[]> arrayList = new ArrayList<>();
        for (;;){
            arrayList.add(new byte[1024]);
        }
    }
}
