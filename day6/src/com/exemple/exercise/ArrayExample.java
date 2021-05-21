package com.exemple.exercise;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
     /*   String tel = "";
        int[] arrry1 = new int[]{1, 2, 3, 6, 7, 8, 9};//7
        int[] arrry2 = new int[]{0, 5, 4, 1, 2, 2, 3, 6, 6, 3, 0};
        System.out.println("现诚招IT行业室友");
        for (int i = 0;i<arrry2.length;i++){
            tel += arrry1[arrry2[i]];
        }
        System.out.println("我的电话是"+tel);*/
        //录入学生成绩
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int studentNumber = scanner.nextInt();
        int[] score = new int[studentNumber];
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入学生的成绩");
            score[i] = scanner.nextInt();
        }
        int max = 0;
        for (int j = 0; j < score.length; j++) {

            if (score[j] >= max) {
                max = score[j];
            }
        }
        System.out.println("最高分是 " + max);
        int mediaA = 0;
        int mediaB = 0;
        int mediaC = 0;
        for (int m = 0; m < score.length; m++) {
            mediaA = max - 10;
            mediaB = max - 20;
            mediaC = max - 30;
            if (score[m] > mediaA) {
                System.out.println("student " + m + " score is " + score[m] + " grade is A");
            } else if (score[m] > mediaB) {
                System.out.println("student " + m + " score is " + score[m] + " grade is B");
            } else if (score[m] > mediaC) {
                System.out.println("student " + m + " score is " + score[m] + " grade is C");
            } else {
                System.out.println("student " + m + " score is " + score[m] + " grade is D");
            }
        }
    }
}
