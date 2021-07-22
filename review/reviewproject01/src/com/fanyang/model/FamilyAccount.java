package com.fanyang.model;

/**
 * @program: reviewproject01
 * @description: 家庭的基本信息
 * @author: FanYang
 * @create: 2021-07-21 19:20
 */
public class FamilyAccount {
    public int balance = 10000; //余额
    public String details = "收支\t账户金额\t收支金额\t说 明\n";
    public String notes;   //收支说明
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
