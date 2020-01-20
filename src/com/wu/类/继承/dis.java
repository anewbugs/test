package com.wu.类.继承;

import com.wu.设计模式.代理.动态代理.Man;

public class dis {
    static abstract class humman{}
    static class man extends humman{}
    static class woman extends humman{}

    public void sy(humman a){
        System.out.println(1);
    }
    public void sy(man a){
        System.out.println(2);
    }
    public void sy(woman a){
        System.out.println(3);
    }

    public static void main(String[] args) {
        humman m = new man();
        humman wo = new woman();

        dis d = new dis();

        d.sy(m);
        d.sy(wo);
    }
}
