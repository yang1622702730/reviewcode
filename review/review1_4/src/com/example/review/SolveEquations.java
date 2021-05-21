package com.example.review;

import java.util.Scanner;

//求ax2+bx+c=0方程的根。
public class SolveEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("二元一次方程的格式为ax^2+bx+c=0");
        System.out.println("请输入二元一次方程的a");
        double a = scanner.nextDouble();
        System.out.println("请输入二元一次方程的b");
        double b = scanner.nextDouble();
        System.out.println("请输入二元一次方程的c");
        double c = scanner.nextDouble();
        double temp;
        double x1 ;
        double x2;
/*
 如果a≠0，那么：
（1）当b2-4ac>0，则有两个解；
（2）当b2-4ac=0，则有一个解；
（3）当b2-4ac<0，则无解；
*/
        if (a != 0) {
            temp = (b * b) - (4 * a * c);
            if (temp == 0) {
                x1 = -(b / (2 * a));
                System.out.println("该方程为二元一次方程，有一个解为"+x1);
            } else if (temp > 0) {
                x1 = (-b + Math.sqrt(temp)) / (2 * a);
                x2 = (-b - Math.sqrt(temp)) / (2 * a);
                System.out.println("该方程为二元一次方程，有两个解为" + x1 + " 和 " + x2);
            } else if (temp < 0) {
                System.out.println("b2-4ac<0，无解");
            }
        }
//        如果a=0,b≠0
        else if (a == 0) {
            if (b != 0) {
                x1 = -(c / b);
                System.out.println("该方程为一元一次方程，有一个解为" + x1);
            } else if (b == 0) {
                System.out.println("不是一个方程，而是一个等式c=0");
                if (c==0){
                    System.out.println("等式成立c=0");
                }
                else {
                    System.out.println("等式恒不成立");
                }
            }
        }
    }
}
