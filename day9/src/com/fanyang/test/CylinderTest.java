package com.fanyang.test;

import com.fanyang.study.Cylinder;

/**
 * @program: day9
 * @description: Cylinder的测试类
 * @author: FanYang
 * @create: 2021-05-23 20:32
 */
public class CylinderTest {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();
        cylinder.setLength(2);
        cylinder.setRadius(2);
        System.out.println(cylinder.findVolume());
    }
}
