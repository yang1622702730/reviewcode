package com.example.review;

//用for循环计算1000以内偶数的和
public class EvenNUmberSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
                if (i%2==0){
                    sum +=i;
                }
        }
        System.out.println(sum);
    }
}
