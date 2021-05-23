package com.fanyang.study;

/**
 * @program: day9
 * @description: 圆的相关操作
 * @author: FanYang
 * @create: 2021-05-23 20:25
 */
public class Circle {
    private double radius;
    public Circle(){
        this.radius = 1;
    }
    public void setRadius(double radius){
        this.radius  = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
