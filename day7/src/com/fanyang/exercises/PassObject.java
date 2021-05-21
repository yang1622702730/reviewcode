package com.fanyang.exercises;

public class PassObject {
    /**
     * Description 求传入半径范围内的各面积
     * @param c
     * @param time
     */
    public void printArea(TwoCircle c,int time){
        for (int i =1;i<=time;i++){
            System.out.println("time\t\tarea");
            c.radius = i;
            double area = c.findArea();
            System.out.println("r为"+c.radius+"时，面积为"+area);
        }
        System.out.println("半径为"+(time+1)+"时，没有面积");
    }
}
