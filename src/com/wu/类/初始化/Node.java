package com.wu.类.初始化;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class Node {
     static int  A=1;
    final static int B =2;
    final static HashMap hashMap = new HashMap();
    private int a =1;
    static {
        hashMap.put(A,1);
        hashMap.put(B,2);
    }

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.toString());

    }

    public int longestValidParentheses(String s) {
        Stack<Character> Q = new Stack<>();
        int num =0;
        for(int i = 0 ; i < s.length() ; i++ ){
            char ch = s.charAt(i);
            if (!Q.isEmpty()&&ch == ')'){
                char c = Q.peek();
                if (c == '('){
                    num +=2;
                    Q.pop();
                    continue;
                }
            }

            Q.push(ch);
        }

        return num;
    }
}
