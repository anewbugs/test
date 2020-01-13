package com.wu.类.继承;

import java.util.concurrent.Semaphore;

public class Son  extends Father{
    @Override
    public void prit() {
        System.out.println(" test ");
        Semaphore semaphore = new Semaphore(0);

   }
}
