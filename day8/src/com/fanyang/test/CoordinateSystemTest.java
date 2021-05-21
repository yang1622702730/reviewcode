package com.fanyang.test;

import com.fanyang.homework.CoordinateSystem;

public class CoordinateSystemTest {
    public static void main(String[] args){
        CoordinateSystem coordinateSystem1 = new CoordinateSystem(3,4);
        CoordinateSystem coordinateSystem2 = new CoordinateSystem(2,4);
        double distance1 = coordinateSystem1.distanceToZero();
        System.out.println("distance1 = " + distance1);
        double distance2 = coordinateSystem2.distanceToRandom(coordinateSystem1);
        System.out.println("distance2 = " +distance2);
        coordinateSystem1.printPoint();
        coordinateSystem2.printPoint();
    }
}
