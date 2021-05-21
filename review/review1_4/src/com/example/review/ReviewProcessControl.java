package com.example.review;

public class ReviewProcessControl {
    public static void main(String[] args) {
        //if练习一
        int x = 4;
        int y = 1;
        if (x > 2)
            if (y > 2)
                System.out.println(x + y);
                //System.out.println("atguigu");
            else //就近原则
                System.out.println("x is " + x);
        //3.	定义三个int型变量并赋值，使用三元运算符或者if-else获取这三个数中的较大数的实现
        int number1 = 1;
        int number2 = 5;
        int number3 = 3;
        if (number1 > number2){
            if (number3 > number1){
                System.out.println("max = " + number3);
            }
            else if (number3 < number2){
                System.out.println("max = " + number1);
            }
            else{
                System.out.println("max = " + number1);
            }
        }
        else {
            if (number3 > number2){
                System.out.println("max = " + number3);
            }
            else if (number3 < number1){
                System.out.println("max = " + number2);
            }
            else{
                System.out.println("max = " + number2);
            }
        }
        //4.	编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。
        double double1 = 10.1;
        double double2 = 19.1;
        if (double1 > 10.0 && double2 < 20.0){
            System.out.println("sum = " + (double1 + double2));
        }
        else{
            System.out.println("product = " + (double1 * double2));
        }
        //交换两个变量值的代码的实现
        System.out.println("double1 = " +double1+",double2 = " + double2);
        double temp = 0.0;
        temp = double1;
        double1 = double2;
        double2 = temp;
        System.out.println("double1 = " +double1+",double2 = " + double2);
    }
}
