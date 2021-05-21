package com.example.review;

import java.util.Scanner;

//根据指定月份，打印该月份所属的季节。
public class MonthJudgeSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFlog = true;
        int month = 0;
        String season = "";
        while (isFlog) {
            System.out.println("输入月份1-12,输入0退出");
            month = scanner.nextInt();
            switch (month) {
                case 0:
                    isFlog = false;
                    season = "空";
                    System.out.println("正在退出");
                    break;
                case 1:
                case 2:
                case 3:
                    season = "spring";
                    break;
                case 4:
                case 5:
                case 6:
                    season = "summer";
                    break;
                case 7:
                case 8:
                case 9:
                    season = "fall";
                    break;
                case 10:
                case 11:
                case 12:
                    season = "winter";
                    break;
                default:
                    System.out.println("没有这个月份，请重新输入！！！");
                    season = "空";
            }
            System.out.println(month + "对应的季节为" + season);
        }
    }
}
