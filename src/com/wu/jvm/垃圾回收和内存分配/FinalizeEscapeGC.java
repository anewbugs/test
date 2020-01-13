package com.wu.jvm.垃圾回收和内存分配;

import java.net.Socket;

public class FinalizeEscapeGC   {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("yse,I am alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("fianlize method excute");
        FinalizeEscapeGC.SAVE_HOOK =this;
    }

    public static void main(String[] args) throws InterruptedException {


        SAVE_HOOK = new FinalizeEscapeGC();

        SAVE_HOOK = null;
        System.gc();

        if (SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else System.out.println("I am dead");

        SAVE_HOOK = null;
        System.gc();

        if (SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else System.out.println("I am dead");

    }
}
