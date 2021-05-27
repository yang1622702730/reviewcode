package com.fanyang.exercise6;

/**
 * @program: day9
 * @description: Car的相关操作
 * @author: FanYang
 * @create: 2021-05-27 19:45
 */
public class Car extends Vehicle{
    private int loader;

    public Car() {
    }

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public Car(int loader) {
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                '}';
    }
}
