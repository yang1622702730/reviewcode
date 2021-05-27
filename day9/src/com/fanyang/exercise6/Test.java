package com.fanyang.exercise6;

/**
 * @program: day9
 * @description: Test类
 * @author: FanYang
 * @create: 2021-05-27 19:48
 */
public class Test {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle(4,1000);
        Car car = new Car(8,3000,3);
        Truck truck = new Truck(2,1000,3,300);
        System.out.println(vehicle.toString());
        System.out.println(car.toString());
        System.out.println(truck.toString());
    }
}
