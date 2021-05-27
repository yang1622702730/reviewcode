package com.fanyang.exercise6;

/**
 * @program: day9
 * @description: Truck的操作
 * @author: FanYang
 * @create: 2021-05-27 19:46
 */
public class Truck extends Car{
    private double payload;

    public Truck() {
    }

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public Truck(double payload) {
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                '}';
    }
}
