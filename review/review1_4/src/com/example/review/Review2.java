package com.example.review;

public class Review2 {
    public static void main(String[] args) {
        //计算机中四种进制转化为十进制
        int num1 = 0b110;
        int num2 = 110;
        int num3 = 0127;
        int num4 = 0x1110A;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        //字符串的练习1
        char char1 = 'a';
        int number1 = 10;
        String string1 = "hello";
        System.out.println(char1 + number1 + string1);//107hello
        System.out.println(char1 + string1 + number1);//ahello10
        System.out.println(string1 + number1 + char1);//hello10a
        //字符串的练习2
        System.out.println("*   *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));
        //布尔类型的练习1
        boolean bol1 = true;
        if (bol1) {
            System.out.println("你不能参加派对等活动");
        } else {
            System.out.println("你可以谈女朋友");
        }
        //基本数据类型的运算规则
        byte byte1 = 2;
        int int1 = 129;
        //byte byte2 = byte1 +int1;
        int int2 = byte1 + int1;
        long l1 = byte1 + int1;
        System.out.println(int2);
        System.out.println(l1);
        char c1 = 'a';//97
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        short s2 = 10;
        int c2 = c1 + s2;
        //强制类型转换
        //练习一
        double d1 = 12.9;
        int i1 = (int) d1;
        System.out.println(i1);
        //练习二
        long ll1 = 125;
        short sht1 = (short) ll1;
        System.out.println(sht1);
        //练习三
        int i2 = 128;
        byte b = (byte) i2;
        System.out.println(b);//-128
        //练习四
        long ll2 = 1124124412;
        System.out.println(ll2);
        //练习五
        float ff1 = 12.3f;
        System.out.println(ff1);
        float ff2 = (float) 12.3;
        System.out.println(ff2);
        //整型常量，默认类型为int型
        //浮点型常量，默认类型为double型

        //分离三位数的百,十，个位
        int num111 = 135;
        int bai = num111 / 100;
        int ge = num111 % 10;
        int shi = num111 / 10 % 10;
        System.out.println("bai = " + bai + ",shi = " + shi + ",ge = " + ge);
        //算术运算符
        int number11 = 13;
        int number12 = 12;
        int div_Result = number11 / number12;
        System.out.println(div_Result);
        int mul_Result = number11 * number12;
        System.out.println(mul_Result);
        int add_Result = number11 + number12;
        System.out.println(add_Result);
        int sub_Result = number11 - number12;
        System.out.println(sub_Result);
        int del_Result = number11 % number12;
        System.out.println(del_Result);
        //先后加减的区别
        //(前)-- 或 ++:先自减加1，后运算
        //(后)-- 或 ++:先运算，后自减加1
        int a1 = 10;
        int a2 = 12;
        a1 = ++a2;
        System.out.println(a1);
        System.out.println(a2);
        a1 = a2++;
        System.out.println(a1);
        System.out.println(a2);
        //位运算符
        int i = 21;
        i = -21;
        System.out.println("i << 2 :" + (i << 2));
        System.out.println("i << 3 :" + (i << 3));
        System.out.println("i << 27 :" + (i << 27));

        int m = 12;
        int n = 5;
        System.out.println("m & n :" + (m & n));
        System.out.println("m | n :" + (m | n));
        System.out.println("m ^ n :" + (m ^ n));
        //比较运算符
        int i111 = 10;
        int j111 = 20;

        System.out.println(i111 == j111);//false
        System.out.println(i111 = j111);//20
        //分支结构中的if-else（条件判断结构）
        if (i111 <= 20 && j111 >= 20) {
            System.out.println("条件满足");
        }
        int age = 21;
        if (age < 18) {
            System.out.println("可以看动画片");
        } else {
            System.out.println("要少看甚至不看动画片");
        }
        int wealth = 50000;
        if (wealth < 10000 && wealth >= 0) {
            System.out.println("穷逼");
        } else if (wealth >= 10000 && wealth < 50000) {
            System.out.println("小有钱");
        } else if (wealth >= 50000 && wealth < 1000000) {
            System.out.println("一般有钱");
        } else {
            System.out.println("超级有钱");
        }
        //逻辑运算符
        //&  && |  || ! ^
        //区分& 与 &&
        boolean b1 = true;
        b1 = false;
        int num1111 = 10;
        if (b1 & (num1111++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }

        System.out.println("num1111 = " + num1111);


        boolean b2 = true;
        b2 = false;
        int num2222 = 10;
        if (b2 && (num2222++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }

        System.out.println("num2222 = " + num2222);
        //|和||同理
        //阿斯克码的转化
        char c4 = 53;
        System.out.println(c4);
        int i111111 = (int) c4;
        System.out.println(i111111);
        //使用三元运算符判断三个数的最大值
        int test1 = 1;
        int test2 = 5;
        int test3 = 3;
        int twoMax = (test1 > test2) ? test1 : test2;
        int threeMax = (test3 > twoMax) ? test3 : twoMax;
        System.out.println(threeMax);
        //赋值运算符练习一
        int i42323 = 2;
        i42323 *= 0.9;
        System.out.println(i42323);//0
        int iii2 = 1;
//        iii2 = (int)(iii2 * 0.1);
//        System.out.println(iii2);
        i42323++;
        System.out.println(i42323);//1
        //赋值运算符练习二
        int dd1 = 11;
        int dd2 = 22;
        dd2 += dd1++;
        System.out.println(dd2);
        dd2 += ++dd1;
        System.out.println(dd2);
        //赋值运算符练习三
        int n1 = 10;
        n1 += (n1++) + (++n1);//n1 = n1 + (n1++) + (++n1);
        System.out.println(n1);//32
    }
}
