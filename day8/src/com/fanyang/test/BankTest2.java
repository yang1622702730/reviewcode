package com.fanyang.test;

import com.fanyang.project02.Account;
import com.fanyang.project02.Bank;

/**
 * @program: day8
 * @description: project02的测试
 * @author: FanYang
 * @create: 2021-05-18 23:40
 */
public class BankTest2 {
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.addCustomer("y","f");
        bank.addCustomer("l","s");
        bank.addCustomer("x","p");
        bank.addCustomer("x","m");
        bank.getCustomer(1).setAccount(new Account(2000));//创建第二个用户的实例
        bank.getCustomer(1).printInfo();
        bank.getCustomer(1).getAccount().withdraw(100);
        bank.getCustomer(1).getAccount().deposit(2000);
        System.out.println();
        System.out.println();
        bank.getCustomer(2).setAccount(new Account(2000));//创建第三个用户的实例
        bank.getCustomer(2).printInfo();
        bank.getCustomer(2).getAccount().withdraw(200);
        bank.getCustomer(2).getAccount().deposit(1000);
    }
}
