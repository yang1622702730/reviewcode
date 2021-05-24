package com.fanyang.exercise;

/**
 * @program: day9
 * @description: Account的测试类
 * @author: FanYang
 * @create: 2021-05-24 10:47
 */
public class AccountTest {
    public static void main(String[] args){
        Account account = new Account(1122,20000,0.045);
        account.withdraw(30000);
        account.withdraw(2500);
        account.deposit(1000);
    }
}
