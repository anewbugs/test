package com.wu.类.继承;

import java.util.concurrent.Semaphore;

public class Son  extends Father{
    public Son() {
        super();
        this.getClass();


    }

    @Override
    public void prit() {
        System.out.println("son test ");


   }
}
