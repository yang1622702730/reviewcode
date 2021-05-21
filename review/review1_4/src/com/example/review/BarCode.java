package com.example.review;

/**
 * 生成13位条形码
 * Ean-13码规则：第十三位数字是前十二位数字经过计算得到的校验码。
 * 例如：690123456789
 * 计算其校验码的过程为：
 * ① 前十二位的奇数位和6+0+2+4+6+8=26
 * ② 前十二位的偶数位和9+1+3+5+7+9=34
 * ③ 将奇数和与偶数和的三倍相加26+34*3=128
 * ④ 取结果的个位数：128的个位数为8
 * ⑤ 用10减去这个个位数10-8=2
 * 所以校验码为2
 * （注：如果取结果的个位数为0，那么校验码不是为10（10-0=10），而是0）
 * 实现上述代码的功能，计算验证码，输入12位条码，返回带验证码的条码。
 * 例：输入：692223361219输出：6922233612192
 */

public class BarCode {
    public static void main(String[] args) {
        int nuEvenSum = 0;
        int evenSum = 0;
        int[] randoms = new int[13];
        for (int i = 0; i < 13; i++) {
            randoms[i] = (int) ((Math.random() * 9) + 1);
            System.out.println(randoms[i]);
        }
        for (int i = 0; i < 13; i++) {
            if (i % 2 == 0) {
                nuEvenSum += randoms[i];
            } else {
                evenSum += randoms[i];
            }
        }
        nuEvenSum -= randoms[12];
        System.out.println("奇数位和为" + nuEvenSum);
        System.out.println("偶数位和为" + evenSum);
        int result = 0;
        result = nuEvenSum + evenSum * 3;
        int fetchResult = result % 10;
        int endResult = 10 - fetchResult;
        if (endResult == 10) {
            endResult = 0;
        }
        System.out.println("endResult = " + endResult);
        randoms[12] = endResult;
        for (int i = 0; i <= 12; i++) {
            System.out.println("random[" + i + "] = " + randoms[i]);
        }
    }
}
