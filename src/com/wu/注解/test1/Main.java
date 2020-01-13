package com.wu.注解.test1;

public class Main {
    public static void main(String[] args) {
        Service service = new Conn();
        service.startup();
        System.out.println(service.toString());
    }
}
