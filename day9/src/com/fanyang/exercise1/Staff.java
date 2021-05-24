package com.fanyang.exercise1;

/**
 * @program: day9
 * @description: Staff的相关操作
 * @author: FanYang
 * @create: 2021-05-24 16:17
 */
public class Staff extends Employee{
    private String duty;

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Staff(String office, double wage, String hireDate, String duty) {
        super(office, wage, hireDate);
        this.duty = duty;
    }
    public Staff(String duty){
        this.duty = duty;
    }
}
