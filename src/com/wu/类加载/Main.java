package com.wu.类加载;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main  {
    static {
        System.out.println("Main load...........");
    }
    public static void main(String[] args) {
        System.out.println(Node.a);
        Node.method();

//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        HashMap<Integer,Integer> hashMap1 = new HashMap<>();
//
//        for (int i = 0; i < 7; i++) {
//            hashMap.put(i * 16 +1,i);
//            hashMap1.put(i,i);
//
//        }
//
//        long t1 = System.nanoTime();
//        hashMap.get(16*6 +1);
//        System.out.println(System.nanoTime()-t1);
//
//         t1 = System.nanoTime();
//        hashMap1.get(6);
//        System.out.println(System.nanoTime()-t1);


    }
}
