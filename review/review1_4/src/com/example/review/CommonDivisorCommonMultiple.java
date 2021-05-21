package com.example.review;


/**
* 输入两个正整数m和n，求其最大公约数和最小公倍数
*/
public class CommonDivisorCommonMultiple {
    public static void main(String[] args) {
        int m = 12;
        int n = 28;
        int max = (m > n) ? m : n;
        int min = (m > n) ? n : m;
        for (int i = min;i>=1;i--){
            if (m%i==0&&n%i==0){
                System.out.println("最大公约数是"+i);
                break;
            }
        }
        for (int j = max;j<=m*n;j++){
            if (j%m==0&&j%n==0){
                System.out.println("最小公倍数是"+j);
                break;
            }
        }
    }
}
