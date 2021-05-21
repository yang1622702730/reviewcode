package com.example.review;
//使用双重循环打印20 * 8的矩形，使用for循环实现
public class Matrix {
    public static void main(String[] args) {
        for (int i = 0;i<20;i++){
            for (int j =0;j<8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
