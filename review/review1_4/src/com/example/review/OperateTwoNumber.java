package com.example.review;

import java.util.Scanner;

//要求用户输入两个数a和b，如果a能被b整除或者a加b大于1000，则输出a；否则输出b。
public class OperateTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入a");
        int numberA = scanner.nextInt();
        System.out.println("输入b");
        int numberB = scanner.nextInt();
        if (numberA % numberB == 0 || ((numberA + numberB) > 1000)) {
            System.out.println("a = " + numberA);
        } else {
            System.out.println("b = " + numberB);
        }
    }
}
