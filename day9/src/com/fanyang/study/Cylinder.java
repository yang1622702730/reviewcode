package com.fanyang.study;

/**
 * @program: day9
 * @description: 圆柱体的相关操作
 * @author: FanYang
 * @create: 2021-05-23 20:25
 */
public class Cylinder extends Circle{
    private double length;
    public Cylinder(){
        this.length = 1;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }
    public double findVolume(){
        return findArea()*length;
    }
}
