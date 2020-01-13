package com.wu.注解.test;

public class Main {
    public static void main(String[] args) {
        Class clazz = Node.class;
        DirClass dirClass = (DirClass) clazz.getAnnotation(DirClass.class);
         }
}
