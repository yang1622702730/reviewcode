package com.fanyang.exercise;

/**
 * @program: day9
 * @description: 可透支账户
 * @author: FanYang
 * @create: 2021-05-24 10:59
 */
public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {
        if (getBalance() >=amount) {
            System.out.println("取款成功");
            setBalance((getBalance() - amount));
            System.out.println("余额为" + getBalance());
        } else if (getBalance() < amount) {
            System.out.println("现在需要透支消费");

            double pay = amount - getBalance();
            setBalance(0);
            if (overdraft >= pay) {
                overdraft -= pay;
                System.out.println("透支成功");
                System.out.println("现在的余额为" + getBalance());
                System.out.println("还可以透支" + overdraft);
            } else {
                System.out.println("透支余额不足");
            }
        }
    }

    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
        checkAccount.withdraw(5000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);
    }
}
