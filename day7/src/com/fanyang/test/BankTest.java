package com.fanyang.test;

import com.fanyang.exercises.Account;
import com.fanyang.exercises.Customer;

public class BankTest {
    public static void main(String[] args){
        Account account = new Account();
        Customer customer = new Customer();
        String info = account.getInfo(customer);
        System.out.println(info);
        boolean b1 = account.save(customer,100);
        boolean b2 = account.withDraw(customer,2000);
        System.out.println(b1);
        System.out.println(b2);
        String info1 = customer.say();
        System.out.println(info1);
    }
}
