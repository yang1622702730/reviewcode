package com.fanyang.homework;
/*

编程创建一个Box类，在其中定义三个变量表示一个立方体的长、宽和高，定义一个方法求立方体的体积。创建一个对象，求给定尺寸的立方体的体积。
        （提供无参的构造器和一个有参的构造器）
*/
public class Box {
    double height;
    double length;
    double wide;

    /**
     * Description 求Box的体积
     * @return
     */

    public double volume() {
        return height * length * wide;
    }

    public Box() {
        System.out.println("成功初始化");
    }

    public Box(double height, double length, double wide) {
        this.height = height;
        this.length = length;
        this.wide = wide;
    }


}
