package com.wu.lamda;

import java.io.IOException;
import java.sql.SQLOutput;

public class 冒号 {
//    static class Node{
//       public Node(){};
//
//        public Node(String s) {
//            System.out.println(s);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        InterfaceExample interfaceExample = Node::new;
//        System.out.println(interfaceExample.create("test"));
//
//    }
//}
//interface InterfaceExample<S>{
//    S create(String name);


    public static void main(String[] args) {
        String s = "345434e32423";
        String[] sp = s.split("e");
        if (sp.length > 2 ) return ;

        try {
            Float.parseFloat(s);
        }catch (Exception E){
            return ;
        }

    }

}