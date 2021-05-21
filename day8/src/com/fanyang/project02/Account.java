package com.fanyang.project02;

import java.util.Scanner;

/**
 * @program: day8
 * @description: Account的属性和方法
 * @author: FanYang
 * @create: 2021-05-18 23:05
 */
public class Account {
    private double balance;//账户余额

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @Description: 取钱
     * @Prame: [amount]
     * @return: void
     * @author: FanYang
     * @time:
     */
    public void withdraw(double amount) {
        boolean isFlog = false;
        if ((balance - amount) >= 0) {
            this.balance -= amount;
            isFlog = true;
        } else {
            System.out.println("余额不足！！！，请重新输入取钱数");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请重新输入取款金额");
            amount = scanner.nextDouble();
            withdraw(amount);
        }
        if (isFlog) {
            System.out.println("取钱 = " + amount);
            System.out.println("余额 = " + this.balance);
        }
    }

    /**
     * @Description: 存钱
     * @Prame: [amount]
     * @return: void
     * @author: FanYang
     * @time:
     */
    public void deposit(double amount) {
        System.out.println("存款前有余额 = " + balance);
        this.balance += amount;
        System.out.println("存款 = " + amount);
        System.out.println("现有余额 = " + balance);
    }
}
