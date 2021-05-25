package com.fanyang.exercise2;

/**
 * @program: day9
 * @description: 代表矩形
 * @author: FanYang
 * @create: 2021-05-25 16:01
 */
public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle() {
    }

    public MyRectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double findArea(){
        return getHeight()*getWidth();
    }
}
