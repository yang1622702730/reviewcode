package com.fanyang.test;

import com.fanyang.exercises.Circle;

public class CircleTest {
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.radius = 2;
        double area = circle.computeArea();
        System.out.println(area);
    }
}
