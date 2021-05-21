package com.exemple.exercise;

//利用随机数生成一个整数数组，数组中有10个元素，每个元素的值都在1-30之间，且要求各个数值不能相同。打印该数组。

import java.util.Arrays;

public class RandomNumberArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) (Math.random() * 29 + 1);
            array[i] = randomNumber;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    array[i] = (int) (Math.random() * 29 + 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
