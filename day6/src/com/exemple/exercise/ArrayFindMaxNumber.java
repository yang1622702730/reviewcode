package com.exemple.exercise;

import java.util.Arrays;

public class ArrayFindMaxNumber {
    public static void main(String[] args){
        int[][] twoArray = new int[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int[] newOneArray = new int[5];
        int max = 0;
        for (int i = 0;i<twoArray.length;i++){
            for (int j = 0;j<twoArray[i].length;j++){
                if (twoArray[i][j]>=max){
                    max = twoArray[i][j];
                }
            }
            newOneArray[i] = max;
        }
        System.out.println(Arrays.toString(newOneArray));
    }
}
