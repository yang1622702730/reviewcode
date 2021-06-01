package com.fanyang.test;

/**
 * @program: day10
 * @description:
 * @author: FanYang
 * @create: 2021-06-02 00:19
 */
public class Test {
    static int x, y, z;

    static {
        int x = 5;
        x--;
    }

    static {
        x--;
    }

    public static void main(String[] args) {
        System.out.println("x=" + x);
        z--;
        method();
        System.out.println(z);
        System.out.println(y);
        System.out.println("result:" + (z + y + ++z));
    }

    public static void method() {
        y = z++ + ++z;
    }
}

