package com.wu.类加载.初始化;

public class DeadLoopClass {
    static class intCalss{
        static {
            if (true){
                System.out.println(Thread.currentThread() + "  init");
                while(true){}
            }
        }
    }

    public static void main(String[] args) {
        Runnable scrop = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "  s");
                intCalss intCalss = new intCalss();
                System.out.println(Thread.currentThread() + "  e");
            }
        };


        Thread thread = new Thread(scrop);
        Thread thread1 = new Thread(scrop);
        thread.start();
        thread1.start();

    }
}
