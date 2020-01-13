package com.wu.jvm.运行时区域;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    static class node{
        byte[] b = new byte[1024 *1024];
    }

    public static void main(String[] args) {
        List<node> l = new ArrayList<>();
        for (;;){
            l.add(new node());
        }
    }
}
