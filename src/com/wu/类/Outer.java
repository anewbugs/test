package com.wu.类;

public class Outer {
    private int num = 1;
    private int num1 = 10;

    public class Inner {
        private int num = 2;
        public void func () {
            System.out.println(Outer.this.num);
            System.out.println(num1);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner(){public void func () {

            System.out.println(1);
        }};

    }
}