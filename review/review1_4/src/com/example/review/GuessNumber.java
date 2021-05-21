package com.example.review;

/**

假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。

        1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
        2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
        3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
        4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
        5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
*/

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randoms = (int)(Math.random()*90+10);
        System.out.println("随机数="+randoms);
        System.out.println("请输入你猜的数");
        int guessNumber=scanner.nextInt();
        int tenDigitNumber = guessNumber / 10;
        int unitsDigitNumber = guessNumber % 10;
        int tenDigitRandom = randoms / 10;
        int unitsDigitRandom = randoms % 10;
        if (guessNumber == randoms){
            System.out.println("+10000");
        }
        else if (tenDigitNumber == unitsDigitRandom && unitsDigitNumber == tenDigitRandom){
            System.out.println("+3000");
        }
        else if (tenDigitNumber == tenDigitRandom || unitsDigitNumber == unitsDigitRandom){
            System.out.println("+1000");
        }
        else if (tenDigitNumber == unitsDigitRandom || unitsDigitNumber == tenDigitRandom){
            System.out.println("+500");
        }
        else{
            System.out.println("彩票作废，没有猜中！！");
        }
    }
}
