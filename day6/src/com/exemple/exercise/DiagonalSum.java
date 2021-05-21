package com.exemple.exercise;


//求一个3*3矩阵对角线元素之和
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] twoArray = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.println("输入值");
                twoArray[i][j] = scanner.nextInt();
                System.out.println("twoArray[" + i + "][" + j + "] = " + twoArray[i][j]);
            }
        }
        System.out.println("请选择左对角线，还是右对角线,true为左，false为右");
        boolean direction = scanner.nextBoolean();
        for (int i = 0; i < twoArray.length; i++) {
            if (direction) {
                int j = i;
                sum += twoArray[i][j];
                System.out.println(sum);
            }
            else{
                int j = 3 - i-1;
                sum += twoArray[i][j];
                System.out.println(sum);
            }
        }
        }
    }
