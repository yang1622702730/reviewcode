package com.fanyang.test;

import com.fanyang.homework.Box;

public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(1.1,2.1,2.3);
        double volumes = box2.volume();
        System.out.println(volumes);
    }
}
