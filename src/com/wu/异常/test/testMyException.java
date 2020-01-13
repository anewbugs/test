package com.wu.异常.test;

public class testMyException {

    public static void main(String[] args) throws MyException {
        new testMyException().fun();
    }



    public void fun() throws MyException {
        throw new MyException();
    }




}
