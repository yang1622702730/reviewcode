package com.fanyang.exercise;

public class TriAngle {
    private double base;
    private double height;

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public TriAngle(double b, double h) {
        base = b;
        height = h;
    }

    public TriAngle() {
    }
}
