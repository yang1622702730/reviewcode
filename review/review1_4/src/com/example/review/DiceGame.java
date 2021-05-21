package com.example.review;


/*
提供三个1-6的随机数，作为掷骰子得到的点数。
        如果各个点数相同，则为豹子。
        如果三个骰子点数和，小于或等于9，则为“小”。
        如果三个骰子点数和，大于9，则为“大”。
        用户随机选择：押大、押小或者押豹子。通过判断，输出客户是否押正确。
 */

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("下面将产生三个骰子随机数");
        int count1 = (int) (Math.random() * 5 + 1);
        int count2 = (int) (Math.random() * 5 + 1);
        int count3 = (int) (Math.random() * 5 + 1);
        System.out.println("下面将对点数进行判断");
        String countType = "";
        String guessType = "";
        if (count1 == count2 && count2 == count3) {
            System.out.println("豹子");
            countType = "豹子";
        } else if ((count1 + count2 + count3) <= 9) {
            System.out.println("小");
            countType = "小";
        } else if ((count1 + count2 + count3) >= 9) {
            System.out.println("大");
            countType = "大";
        }
        System.out.println(countType);
        System.out.println("轮到用户压类型");
        guessType = scanner.nextLine();
        System.out.println(guessType);
        if (guessType.equals(countType)){
            System.out.println("你压对了");
        }
        else{
            System.out.println("你压错了");
        }
    }
}
