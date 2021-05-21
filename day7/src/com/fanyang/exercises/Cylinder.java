package com.fanyang.exercises;

import java.util.Scanner;

/*
1）声明一个圆柱体类型，
（2）声明属性：底边的半径，和高
（3）声明方法：
A：方法的功能：在方法中打印圆柱体的详细信息
	圆柱体的底边的半径是xxx，高是xxx，底面积是xxx，体积是xxx。
B：方法的功能：返回底面积
C：方法的功能：返回体积
D：方法的功能：为圆柱体的底边的半径，和高赋值
E：方法的功能：为圆柱体的底边的半径，和高赋值，并返回赋值的结果
	如果底边的半径或高为<=0，赋值失败，返回false，否则返回true
（4）并测试

 */
public class Cylinder {
    double radius;
    double height;
    public void basicInfo(){
        System.out.println("radius = "+radius+"height =" + height+"底面积 = " + Math.PI*radius*radius+"体积 = " +Math.PI*radius*radius*height);
    }

    public double floorSpace(){
        double buttonSpace =Math.PI*radius*radius;
        return buttonSpace;
    }
    public double volume(){
        double volumes =floorSpace()*height;
        return volumes;
    }
    public double  assignmentRadius(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入半径");
        radius = scanner.nextDouble();
        if (radius<0){
            System.out.println("半径不能为负数");
            assignmentRadius();
        }
        return radius;
    }
    public double  assignmentHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入高");
        height = scanner.nextDouble();
        if (height <0){
            System.out.println("高不能为负数");
            assignmentHeight();
    }
        return height;
    }

}
