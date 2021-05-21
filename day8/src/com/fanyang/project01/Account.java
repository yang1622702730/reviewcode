package com.fanyang.project01;

import java.util.Scanner;


public class Account {
    private int id;  //用户Id
    private double balance; //账户余额
    private double annualInterestRate;//年利率

    /**
     *Description 初始化Account
     * @param id
     * @param balance
     * @param annualInterestRate
     */
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Description 取钱
     *
     * @param amount
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
        if (isFlog == true) {
            System.out.println("取钱 = " + amount);
            System.out.println("余额 = " + this.balance);
        }
    }

    /**
     * Description 存款
     *
     * @param amount
     */
    public void deposit(double amount) {
        System.out.println("存款前有余额 = " + balance);
        this.balance += amount;
        System.out.println("存款 = " + amount);
        System.out.println("现有余额 = " + balance);
    }


}

