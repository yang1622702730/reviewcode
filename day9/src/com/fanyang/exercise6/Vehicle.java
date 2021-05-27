package com.fanyang.exercise6;

/**
 * @program: day9
 * @description: Vehicle的操作
 * @author: FanYang
 * @create: 2021-05-27 19:44
 */
public class Vehicle {
    private int wheels;
    private double weight;

    public Vehicle() {
    }

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}
