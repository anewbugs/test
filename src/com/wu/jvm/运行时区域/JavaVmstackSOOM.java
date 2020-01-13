package com.wu.jvm.运行时区域;

public class JavaVmstackSOOM {
    private void dontStop(){
        while (true){}
    }

    public void StackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVmstackSOOM javaVmstackSOOM = new JavaVmstackSOOM();
        javaVmstackSOOM.StackLeakByThread();
    }
}
