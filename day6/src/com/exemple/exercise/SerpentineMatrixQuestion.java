package com.exemple.exercise;


import java.util.Scanner;

//从键盘输入一个整数（1~20）
//则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。例如： 输入数字2，则程序输出：
//1 2
//4 3
//输入数字3，则程序输出：
//1 2 3
//8 9 4
//7 6 5
public class SerpentineMatrixQuestion {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你的蛇形矩阵的规格");
//        int size = scanner.nextInt();
//        int[][] array = new int[size][size];
//        for (int i = 0;i<array.length;i++){
//            if (i<size){
//                array[i][] = i;
//            }
//            else
//        }
        int n = 7;
        int[][] arr = new int[n][n];

        int count = 0; // 要显示的数据
        int maxX = n - 1; // x轴的最大下标
        int maxY = n - 1; // Y轴的最大下标
        int minX = 0; // x轴的最小下标
        int minY = 0; // Y轴的最小下标
        while (minX <= maxX) {
            for (int x = minX; x <= maxX; x++) {
                arr[minY][x] = ++count;
            }
            minY++;
            for (int y = minY; y <= maxY; y++) {
                arr[y][maxX] = ++count;
            }
            maxX--;
            for (int x = maxX; x >= minX; x--) {
                arr[maxY][x] = ++count;
            }
            maxY--;
            for (int y = maxY; y >= minY; y--) {
                arr[y][minX] = ++count;
            }
            minX++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                String space = (arr[i][j] + "").length() == 1 ? "0" : "";
                System.out.print(space + arr[i][j] + " ");
            }
            System.out.println();
        }
        double f4[]={1,3,5};
    }
}
