package com.exemple.exercise;

import java.util.Arrays;

public class DiagonalReset {
    public static void main(String[] args) {
        int[][] newArray = new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i; ; ) {
                newArray[i][j] = 0;
                break;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }
    }
}
