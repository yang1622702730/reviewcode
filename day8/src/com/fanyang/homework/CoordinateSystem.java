package com.fanyang.homework;
/*定义一个类，用于描述坐标点
        0——————>X
        |
        |
        |          P(X,Y)
        |
        |
        Y

        （1）具有计算当前点到原点距离的功能
        （2）求到任意一点（m，n）的距离
        （3）求到任意一点（Point p）的距离
        （4）具有坐标点显示功能，显示格式（x，y）
        （5）提供无参的构造器和一个有参的构造器
 */

public class CoordinateSystem {
    private double x;
    private double y;
    double distance = 0.0;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public CoordinateSystem(double x, double y) {
        System.out.println("初始化成功");
        this.x = x;
        this.y = y;
    }

    /**
     * Description 具有计算当前点到原点距离的功能
     * @return
     */
    public double distanceToZero() {
        distance = Math.sqrt(Math.pow(this.x - 0,2) + Math.pow(this.y - 0,2));
        return distance;

    }

    /**
     * Description 求到任意一点（Point p）的距离
     * @param coordinateSystem
     * @return
     */
    public double distanceToRandom(CoordinateSystem coordinateSystem){
        distance = Math.sqrt(Math.pow(this.x - coordinateSystem.x,2) + Math.pow(this.y - coordinateSystem.y,2));
        return distance;
    }

    /**
     * Description 具有坐标点显示功能，显示格式（x，y）
     */
    public void printPoint(){
        System.out.println("x = "+ this.x+",y = "+this.y);
    }

}
