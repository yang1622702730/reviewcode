package com.fanyang.exercise8;

import org.junit.jupiter.api.Test;

/**
 * @program: day9
 * @description: Vehicle的测试类
 * @author: FanYang
 * @create: 2021-05-27 20:09
 */
public class VehicleTest {
    @Test
    public void test1(){
        Car car = new Car();
        car.moving();
    }
    @Test
    public void test2(){
        Airplane airplane = new Airplane();
        airplane.moving();
    }
    @Test
    public void test3(){
        Steamship steamship = new Steamship();
        steamship.moving();
    }
}
