package com.example.review;

import java.util.Scanner;
//输入高度，输出倒直角三角形。如：输入4, 将输出如下图形
public class HorseGraphics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入高度");
        int j = scanner.nextInt();
        for (int i=0;i<j;i++){
            for (int m =0;m<j-i;m++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
