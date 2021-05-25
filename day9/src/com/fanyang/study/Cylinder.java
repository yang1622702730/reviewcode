package com.fanyang.study;

/**
 * @program: day9
 * @description: 圆柱体的相关操作
 * @author: FanYang
 * @create: 2021-05-23 20:25
 */
public class Cylinder extends Circle{
    private double length;
    public Cylinder(){
        this.length = 1;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }

    /**
     * @Description: 求圆柱的体积
     * @Prame: []
     * @return: double
     * @author: FanYang
     * @time:
     */
    public double findVolume(){
        return super.findArea()*length;
    }

    /**
     * @Description: 求圆柱的表面积
     * @Prame: []
     * @return: double
     * @author: FanYang
     * @time:
     */
    public double findArea(){
        return  (2*Math.PI*getRadius()*getLength()+2*Math.PI*getRadius()*getRadius());
    }
}
