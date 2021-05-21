package com.example.review;

/**
 * 山上有一口缸可以装50升水，现在有15升水。老和尚叫小和尚下山挑水，每次可以挑5升。问：小和尚要挑几次水才可以把水缸挑满？通过编程解决这个问题。
 * 提示：
 * (1) 用整型变量water表示水缸里的水“int water = 15;”。
 * (2) 用整型变量l表示小和尚下山挑水的次数“int l = 0;”。
 * (3) 分析循环条件（水少于50升），循环操作（水增加5升，挑水次数增加1）。
 * (4) 套用while循环（或do-while循环）写出代码。
 */

public class LiftWater {
    public static void main(String[] args) {
        int water = 15;//最大容量为50
        int liftCount = 0;//抬水次数
        for (liftCount = 0; ; ) {
            if (water <= 45) {
                water += 5;
                System.out.println("现在的水量为" + water);
                liftCount++;
            } else if (water >= 50) {
                System.out.println();
                System.out.println("再加点话水就满了");
                System.out.println("总共抬了" + liftCount + "次");
                break;
            }
        }
    }
}
