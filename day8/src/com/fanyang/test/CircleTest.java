package com.fanyang.test;

import com.fanyang.homework.Circle;

public class CircleTest {
    public static void main(String[] args){
        Circle circle1 = new Circle();
        circle1.radius =  21;
        System.out.println(circle1.radius);
        Circle circle2 = new Circle(3);
        double area = circle2.area();
        double  perimeter= circle2.perimeter();
        System.out.println("area = " + area);
        System.out.println("perimeter = " +perimeter);
    }
}
