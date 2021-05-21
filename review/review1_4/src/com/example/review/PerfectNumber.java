package com.example.review;

public class PerfectNumber {
    public static void main(String[] args) {

        for (int i=1;i<1000;i++){
            int sum = 0;
            for (int j=1;j<=i/2;j++){
                if (i%j==0){
                    sum += j;
                }
            }
            if (i ==sum){
                System.out.println(i+"是完数");
            }
        }
    }
}
