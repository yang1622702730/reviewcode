package com.fanyang.test;

import com.fanyang.project01.Account;
import com.fanyang.project01.Customer;

import java.util.Scanner;


public class BankTest {
    public static void main(String[] args) {
        Account account = new Account(1000, 2000, 0.0123);
        Customer customer = new Customer("fan", "yang");
        Scanner scanner = new Scanner(System.in);
        customer.setAccount(account);
        System.out.println(customer.getAccount().getBalance());
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getAccount().getId());
        boolean isFlog = true;
        while (isFlog == true) {
            System.out.println("请对账户" + customer.getLastName() + "做出选择");
            System.out.println("————————————————————————————————————————");
            System.out.println("输入1为存钱");
            System.out.println("输入2为取款");
            System.out.println("输入0为退出账户");
            int choose = scanner.nextInt();

            switch (choose) {
                case 0:
                    System.out.println("结束操作");
                    isFlog = false;
                    break;
                case 1:
                    System.out.println("输入存款金额");
                    double amount1 = scanner.nextDouble();
                    customer.getAccount().deposit(amount1);
                    continue;
                case 2:
                    System.out.println("输入取款金额");
                    double amount2 = scanner.nextDouble();
                    customer.getAccount().withdraw(amount2);
                    continue;
            }
//            customer.getAccount().deposit(100);
//            customer.getAccount().withdraw(960);
//            customer.getAccount().withdraw(2000);
        }
    }
}
