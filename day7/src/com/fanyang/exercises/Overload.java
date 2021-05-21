package com.fanyang.exercises;

public class Overload {
    public int mOL(int x){
        return x*x;
    }
    public int mOL(int x,int y){
        return x*y;
    }
    public void mOL(String string){
        System.out.println(string);
    }
    public void max(int x,int y){
        int max = (x>y)?x:y;
        System.out.println(max);
    }
    public void max(double x,double y){
        double max = (x>y)?x:y;
        System.out.println(max);
    }
    public void max(double x,double y,double z){
        double max = -100;
        if (z>max){
            max = z;
        }
        if (y>max){
            max = y;
        }
        if (x>max){
            max = x;
        }
        System.out.println(max);
    }
}
