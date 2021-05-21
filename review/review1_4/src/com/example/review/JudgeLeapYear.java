package com.example.review;

import java.util.Scanner;

//编写程序，判断给定的某个年份是否是闰年
public class JudgeLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println(year+"年是闰年");
        }
        else{
            System.out.println(year+"年是平年");
        }
    }


}
