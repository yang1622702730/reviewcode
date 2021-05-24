package com.fanyang.exercise;

/**
 * @program: day9
 * @description: Account的继承类
 * @author: FanYang
 * @create: 2021-05-24 10:50
 */
public class AccountExtends extends Account {
    public static void main(String[] args){
        AccountExtends accountExtends = new AccountExtends();
        accountExtends.withdraw(2000);
        accountExtends.withdraw(10000);
        accountExtends.deposit(10000);
        System.out.println(accountExtends.getMonthlyInterest()*100+"%");
    }
    public AccountExtends(){
        super(1122,20000,0.045);
    }
}
