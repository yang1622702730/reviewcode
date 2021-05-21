package com.fanyang.project01;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;


    /**
     * @Description: 初始化类
     * @Prame: [firstName, lastName]
     * @return: 
     * @author: FanYang
     * @time:  
     */ 
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
