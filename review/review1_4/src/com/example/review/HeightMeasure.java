package com.example.review;

import java.util.Scanner;

public class HeightMeasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = 0;
        for (;;){
            System.out.println("输入身高查询对应的健康体重范围，输入值为多少cm");
            double height = scanner.nextDouble();
            weight = (height-108)*2;
            double lowWeight = weight - 10;
            double upWeight = weight + 10;
//            System.out.println(weight+" "+lowWeight+" "+upWeight);
            System.out.println("你"+height+"cm对应的健康体重范围为"+lowWeight+"斤到"+upWeight+"斤之间");
        }
    }

}
