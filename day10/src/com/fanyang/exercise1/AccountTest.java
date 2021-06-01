package com.fanyang.exercise1;

/**
 * @program: day10
 * @description: Account的测试类
 * @author: FanYang
 * @create: 2021-06-01 16:15
 */
public class AccountTest {
    public static void main(String[] args){
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        System.out.println(account1.getUserId());
        System.out.println(account2.getUserId());
        System.out.println(account3.getUserId());
    }
}
