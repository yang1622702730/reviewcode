package com.fanyang.exercise2;

/**
 * @program: day10
 * @description:
 * @author: FanYang
 * @create: 2021-06-02 16:15
 */
public class Manager extends Employee{
    private int bonus;

    public Manager(){}

    @Override
    public void work() {
        System.out.println("我在工作");
    }

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}
