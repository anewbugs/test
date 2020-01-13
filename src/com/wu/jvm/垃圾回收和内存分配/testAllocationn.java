package com.wu.jvm.垃圾回收和内存分配;

public class testAllocationn {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        testAllocatio();
    }

    public static void testAllocatio(){
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[7 * _1MB];
//        allocation2 = new byte[2 * _1MB];
//        allocation3 = new byte[2 * _1MB];
//        allocation4 = new byte[8 * _1MB];
    }
}