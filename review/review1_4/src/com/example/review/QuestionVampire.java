package com.example.review;
/*写一个程序，找出4位数的所有吸血鬼的数字
        例如：1260=21*60
        1827=21*87*/

public class QuestionVampire {
    public static void main(String[] args) {
        int number1 = 1000;
        int number2 = 9999;
        for (number1 = 1000; number1 <= 1005; number1++) {
            int unitsNumber = number1 % 10;
            int decadeNumber = number1 % 100 / 10;
            int hundredNumber = number1 / 100 % 10;
            int thousandnumber = number1 / 1000;
//            System.out.println(unitsNumber + " " + decadeNumber + " " + hundredNumber + " " + thousandnumber);
        }
    }
}
