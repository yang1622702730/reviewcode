package com.fanyang.exercise3;

import java.util.Objects;

/**
 * @program: day9
 * @description: Circle的操作
 * @author: FanYang
 * @create: 2021-05-26 15:52
 */
public class Circle extends GeometricObject{
    private double radius;
    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return 3.14*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    public String toString(){
        return "Circle [radius=" +getRadius()+"]";
    }
}
