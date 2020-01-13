package com.wu.同步.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        new Th(service).start();
        new Th(service).start();
        new Th(service).start();
        new Th(service).start();
    }
}



class Service {
    Semaphore semaphore = new Semaphore(1);
    public Service() {
    }

    public void doSomething(){
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread());
            Thread.sleep(1000);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Th extends Thread{
    static AtomicInteger atomicInteger = new AtomicInteger(0);
    Service service;

    public Th(Service service) {
        super("name="+String.valueOf(atomicInteger.addAndGet(1)));
        this.service = service;
    }

    @Override
    public void run() {
        while (true){
            service.doSomething();
        }
    }
}