package com.exemple.exercise;
//数组赋值练习1
//创建一个char类型的26个元素的数组，分别 放置'A'-'Z'。
//使用for循环访问所有元素并打印出来。
//数组赋值练习2
//创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z',   后10个元素放置'0'-'9'。
//使用for循环访问所有元素并打印出来。
//提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1'

public class PrintLetter {
    public static void main(String[] args){
        char[] chars = new char[36];
        char number1 = 64;
        for (int i =0;i<chars.length-10;i++){
            number1 +=1;
            chars[i] = number1;
//            System.out.println(chars[i]);
        }
        char number2 = 47;
        for (int i = chars.length-10;i<chars.length;i++){
            number2 +=1;
            chars[i] = number2;
//            System.out.println(chars[i]);
        }
        for (int i =0;i<chars.length;i++){
            System.out.println(chars[i]);
        }

    }
}
