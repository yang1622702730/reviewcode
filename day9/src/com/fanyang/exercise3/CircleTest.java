package com.fanyang.exercise3;

/**
 * @program: day9
 * @description: Circle的测试类
 * @author: FanYang
 * @create: 2021-05-26 16:02
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle(2.3,"white",2.0);
        System.out.println(c1.equals(c2));
        System.out.println(c1.getColor());
        System.out.println(c1.toString());
        System.out.println(c1);
    }
}
