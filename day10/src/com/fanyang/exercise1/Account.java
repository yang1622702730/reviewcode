package com.fanyang.exercise1;

/**
 * @program: day10
 * @description: Account的操作
 * @author: FanYang
 * @create: 2021-06-01 16:10
 */
public class Account {
    private int userId;
    private String password;
    private double balance;
    private static double interestRate = 0.05;
    private static double minMoney = 1.0;
    private static int init = 1001;
    public Account(){
        userId =init++;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static int getInit() {
        return init;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
