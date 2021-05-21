package com.example.review;

//3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。
public class DayHalve {
    public static void main(String[] args) {
        int days = 0;
        for (int rope = 3000; rope >= 5; rope /= 2) {
            days += 1;
        }
        System.out.println("days = " + days);
    }
}
