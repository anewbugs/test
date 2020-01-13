package com.wu.try_catch_finally;

public class Main {
    public static void main(String[] args) {
       function();

    }


    public static void function(){

        while (true){

            try {
                System.out.println("我在try里");

            }finally {
                System.out.println("我在finally里");
            }
        }


    }
}
