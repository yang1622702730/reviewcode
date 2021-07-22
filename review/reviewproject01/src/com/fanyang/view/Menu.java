package com.fanyang.view;

import org.junit.Test;

/**
 * @program: reviewproject01
 * @description: 显示菜单
 * @author: FanYang
 * @create: 2021-07-21 19:14
 */
public class Menu {

    /**
     * @Description: 显示选项菜单
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/21 20:07
    */ 
    public static void showChoiceMenu(){
        System.out.println("-----------------家庭收支记账软件-----------------");
        System.out.println("                 1.收支明细");
        System.out.println("                 2.登记收入");
        System.out.println("                 3.登记支出");
        System.out.println("                 4.退  出");
        System.out.print("\n");
        System.out.println("                 请选择（1-4）");
    }
//    @Test
//    public void test(){
//        showChoiceMenu();
//    }
}
