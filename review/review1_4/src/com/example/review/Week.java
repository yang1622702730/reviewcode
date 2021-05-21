package com.example.review;

import java.util.Scanner;
//编写程序，从键盘接收整数参数。如果该数为1-7，打印对应的星期值，否则打印“非法参数”。

public class Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入1-7的数字，查看今天星期几,输入0退出");
        boolean isFlog = true;
        while (isFlog) {
            System.out.println("请在输入你要查询的数字");
            int week = scanner.nextInt();
            switch (week) {
                case 0:
                    isFlog = false;
                    break;
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4:
                    System.out.println("星期四");
                    break;
                case 5:
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                case 7:
                    System.out.println("星期七");
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
}
