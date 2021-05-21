package com.exemple.exercise;

public class Fibonacci {
    public static void main(String[] args){
        int[] array = new int[20];
        int twoFrontSum = 0;
        array[0] = 0;
        array[1] = 1;
        for(int i = 2;i<20;i++){
            twoFrontSum = array[i-2] + array[i-1];
            array[i] = twoFrontSum;
        }
        for (int i = 0;i<20;i++){
            System.out.println("array["+i+"] = "+array[i]);
        }
    }
}
