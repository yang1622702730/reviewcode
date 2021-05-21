package com.exemple.exercise;

import java.util.Arrays;

//将一个数组逆序输出
public class ReverseOutput {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 56, 876, 41,57};
        for (int i = 0; i < array.length/2; i++) {
//            if (array.length % 2 != 0) {
//                System.out.println("奇数个数");
                int temp = array[i];
                array[i] = array[array.length-i-1];
                array[array.length-i-1] = temp;
//            }
//            else{
//                System.out.println("偶数个数");
//            }
        }
        System.out.println(Arrays.toString(array));
    }
}
