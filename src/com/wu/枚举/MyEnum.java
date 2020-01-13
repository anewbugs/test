package com.wu.枚举;

public enum MyEnum {
    NUM(1),
    NUM2(2),
    NUM3(3),
    ;
    private int value;

    MyEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;


    }
}
