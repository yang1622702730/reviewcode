package com.fanyang.test;

import com.fanyang.exercises.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.assignmentHeight();
        cylinder.assignmentRadius();
        double space = cylinder.floorSpace();
        System.out.println(space);
        double volume = cylinder.volume();
        System.out.println(volume);
        cylinder.basicInfo();
    }
}