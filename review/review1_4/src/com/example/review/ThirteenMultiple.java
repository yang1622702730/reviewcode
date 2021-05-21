package com.example.review;


//打印1-100之间13的倍数，使用for循环
public class ThirteenMultiple {
    public static void main(String[] args) {
        for (int i = 1;i<=100;i++){
            if (i%13==0){
                System.out.println(i);
            }
        }
    }
}
