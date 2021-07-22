package com.fanyang.view;

import com.fanyang.control.ExpensesAndIncome;

import java.util.Scanner;

/**
 * @program: reviewproject01
 * @description:
 * @author: FanYang
 * @create: 2021-07-21 19:42
 */
public class Mains {
    public static void main(String[] args) {

        ExpensesAndIncome expensesAndIncome = new ExpensesAndIncome();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int money = 0;
        while (flag) {
            Menu.showChoiceMenu();
            System.out.println("请做出选择");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-----------------当前收支明细记录-----------------");
                    expensesAndIncome.showBill();
                    System.out.println("--------------------------------------------------");
                    break;
                case 2:
                    System.out.println("请输入收入");
                    money = scanner.nextInt();
                    expensesAndIncome.income(money);
                    break;
                case 3:
                    System.out.println("请输入支出");
                    money = scanner.nextInt();
                    expensesAndIncome.expenses(money);
                    break;
                case 4:
                    System.out.println("确认是否真的退出(Y/N)");
                    String option = scanner.next();
                    if (option.equals("Y")) {
                        flag = false;
                        System.out.println("正在退出中");
                        break;
                    } else if (option.equals("N")) {
                        break;
                    }
                default:
                    System.out.println("输入错误，请重新再来");
            }
        }
    }
}
