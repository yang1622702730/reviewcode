package com.fanyang.test;

import com.fanyang.exercise.TriAngle;

public class TriAngleTest {
    public static void main(String[] args){
        TriAngle triAngle1 = new TriAngle();
        triAngle1.setBase(2);
        triAngle1.setHeight(1);
        System.out.println("base = "+ triAngle1.getBase()+"height = "+triAngle1.getHeight());
        TriAngle triAngle2 = new TriAngle(1.11,1.22);
        System.out.println("base = "+ triAngle2.getBase()+"height = "+triAngle2.getHeight());
        System.out.println("triAngle1的面积为"+(0.5*triAngle1.getHeight()*triAngle1.getBase()));
    }
}
