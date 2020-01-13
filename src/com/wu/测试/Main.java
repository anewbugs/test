package com.wu.测试;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        function();
        function();
        nodd  n= new nodd();
        System.out.println(n.num);
        System.out.println(n);


    }
    public static void function(){
        final nodd  n= new nodd();
        System.out.println(n.num);
        System.out.println(n);
    }

    static class nodd {
        static int a = 0;
        String string ;
        public int num ;
        public nodd() {
            this .num = a;
//            a++;

        }
    }
}
