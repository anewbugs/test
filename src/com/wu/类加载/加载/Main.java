package com.wu.类加载.加载;

public class Main {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        classLoader.getParent();
        System.out.println(classLoader.getParent().getParent());

}
}
