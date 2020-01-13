package com.wu.同步.多线程测试;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        new Th().start();
        new Th().start();
        new Th().start();
        new Th().start();
        new Th().start();
    }
}

class Th extends Thread{
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void run() {
        while (true){
            int a =atomicInteger.getAndAdd(1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() +"" + a);
        }
    }
}