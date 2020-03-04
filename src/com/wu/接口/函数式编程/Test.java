package com.wu.接口.函数式编程;

public class Test  {
    public static void main(String[] args) {
        ReqResultBase r = new ReqResultBase((Function <String>) Mannage :: say);
        Object o = new String("111");
        r.function.apply(o);
    }
}
