package day05;//需求：使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte，short，int，long）

import java.sql.SQLOutput;

public class day05_08_overloadPractice {
    public static void main(String[] args) {
        //调用方法
        System.out.println(compare(10, 20));
        System.out.println(compare((byte) 20, (byte) 20));
        System.out.println(compare((short) 10, (short) 20));
        System.out.println(compare(10L, 20L));


    }

    //定义的4种方法

    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;
    }

}
