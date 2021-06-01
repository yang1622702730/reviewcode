package com.fanyang.test;

/**
 * @program: day10
 * @description: Demo
 * @author: FanYang
 * @create: 2021-06-02 00:11
 */
public class Demo {
    private static int j = 0;

    private static boolean methodB(int k) {
        j += k;
        return true;
    }

    public static void methodA(int i) {
        boolean b;
        b = i < 10 | methodB(4);
        b = i < 10 || methodB(8);
    }

    public static void main(String args[]) {
        methodA(0);
        System.out.println(j);
    }
}

