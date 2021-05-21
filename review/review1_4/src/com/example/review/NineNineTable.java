package com.example.review;

public class NineNineTable {
    public static void main(String[] args) {
        System.out.println("下面我们开始打印九九乘法表");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j)+"  ");
            }
            System.out.println();
        }
    }
}
