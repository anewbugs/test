package com.wu.容器.set;



import com.wu.设计模式.代理.动态代理.Man;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main
{

    public static void main(String[] args) {

       ZeroEvenOdd zeroEvenOdd = new  ZeroEvenOdd(2);
       new T1(zeroEvenOdd).start();
       new T2(zeroEvenOdd).start();
       new T3(zeroEvenOdd).start();

    }
}


class T1 extends Thread{
    ZeroEvenOdd z;
    public T1(ZeroEvenOdd z) {
        this.z = z;
    }

    @Override
    public void run() {
        try {
            z.even();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class T2 extends Thread{
    ZeroEvenOdd z;
    public T2(ZeroEvenOdd z) {
        this.z = z;
    }

    @Override
    public void run() {
        try {
            z.odd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class T3 extends Thread{
    ZeroEvenOdd z;
    public T3(ZeroEvenOdd z) {
        this.z = z;
    }

    @Override
    public void run() {
        try {
            z.zero();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class ZeroEvenOdd {
    private int n;
    private int i = -1;
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // System.out.println(x) outputs "x", where x is an integer.
    public void zero() throws InterruptedException {
        while(i <=  n && i >= -n  ){
            synchronized(this){
                while( i > 0){
                    this.wait();
                }
                System.out.println(0);
                i =  - i ;
                this.notifyAll();
            }
        }
    }

    public void even() throws InterruptedException {
        while(i <=  n && i >= - n  ){
            synchronized(this){
                while((i & 1) != 0 || i < 0){
                    this.wait();
                }
                System.out.println(i);
                i++;
                i = - i;
                this.notifyAll();
            }
        }
    }

    public void odd() throws InterruptedException {
        while(i >= -n  ){
            synchronized(this){
                while( (i & 1) != 1 || i < 0){
                    this.wait(1);

                }
                System.out.println(i);
                i++;
                i = - i;
                this.notifyAll();
            }
        }
    }
}