package com.fanyang.exercise2;

/**
 * @program: day9
 * @description: 代表圆形
 * @author: FanYang
 * @create: 2021-05-25 16:00
 */
public class Circle extends GeometricObject{
    private double radius;
    public Circle(){}
    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double findArea(){
        return Math.PI*getRadius()*getRadius();
    }
}
