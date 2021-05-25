package com.fanyang.exercise2;

/**
 * @program: day9
 * @description: 代表几何形状
 * @author: FanYang
 * @create: 2021-05-25 16:00
 */
public class GeometricObject {
    String color;
    double weight;
    GeometricObject(){}
    GeometricObject(String color, double weight){
        this.color= color;
        this.weight = weight;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public double findArea(){
        return 0.0;
    }
}
