package com.fanyang.homework;

/*
定义一个圆类型
        提供显示圆周长功能的方法
        提供显示圆面积的方法
        提供无参的构造器和一个有参的构造器
*/


public class Circle {
    public double radius;
    public Circle(){
        System.out.println("初始化圆形");
    }
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Description 求圆的周长
     * @return
     */
    public double perimeter(){
        return  Math.PI*radius*2;
    }

    /**
     * Description 求圆的面积
     * @return
     */
    public double area(){
        return Math.PI*radius*radius;
    }
}
