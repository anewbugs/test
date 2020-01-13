package com.wu.异常.test;

public class Main {

    public static void function()  {
        throw  new RuntimeException();
    }

    public static void main(String[] args) {
        function();
    }
}
