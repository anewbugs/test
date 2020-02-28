package com.wu.接口.函数式编程;

public class Test  {
    public static void main(String[] args) {
        ResultBase r = new ResultBase((Function <String>) Mannage :: say);
        r.function.apply("test");
    }
}
