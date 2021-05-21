package com.exemple.exercise;

import java.util.Scanner;

//任意一个人输入年龄，就可以判断出他是哪个年龄段的人？
//
///*
//0-9   儿童
//10-19 少年
//20-29 青少年
//30-39 青年
//40-49 壮年
//50-59 中年
//60-69 中老年
//70-79 老年
//80-89 老老年
//90-99 老老老年
public class AgeGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查询的年龄");
        int age = scanner.nextInt();
        switch (age / 10) {
            case 0:
                System.out.println("现在处于儿童");
                break;
            case 1:
                System.out.println("现在处于少年");
                break;
            case 2:
                System.out.println("现在处于青少年");
                break;
            case 3:
                System.out.println("现在处于青年");
                break;
            case 4:
                System.out.println("现在处于壮年");
                break;
            case 5:
                System.out.println("现在处于中年");
                break;
            case 6:
                System.out.println("现在处于中老年");
                break;
            case 7:
                System.out.println("现在处于老年");
                break;
            case 8:
                System.out.println("现在处于老老年");
                break;
            case 9:
                System.out.println("现在处于老老老年");
                break;
            default:
                System.out.println("没有这个年龄段");
                break;

        }
    }
}
