package com.fanyang.project02;

/**
 * @program: day8
 * @description: Customer的属性和方法
 * @author: FanYang
 * @create: 2021-05-18 23:37
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public void printInfo(){
        System.out.println("account = "+account.getBalance()+",firstName = "+firstName+
                ",lastName = "+lastName);
    }
}
