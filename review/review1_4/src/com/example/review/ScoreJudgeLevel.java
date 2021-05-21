package com.example.review;

import java.util.Scanner;
/*编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值
        输出其对应的成绩等级：*/
public class ScoreJudgeLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        char level = '0';
        System.out.println("输入学生个数");
        int studentNumber = scanner.nextInt();
        int i = 0;
        while (i < studentNumber) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩");
            score = scanner.nextInt();
            if (score <= 100 && score >= 90) {
                level = 'A';
            } else if (score <90 && score >= 70) {
                level = 'B';
            } else if (score >= 60 && score <70) {
                level = 'C';
            } else if (score < 60 && score >=0) {
                level = 'D';
            } else {
                System.out.println("输入成绩超出预期，请重新输入！！！");
                level = '\n';
            }
            System.out.println("第" + (i + 1) + "个学生的成绩为" + score + "等级为" + level);
            i++;
        }
    }
}
