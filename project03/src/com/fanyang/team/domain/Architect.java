package com.fanyang.team.domain;

/**
 * @program: project03
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 14:18
 */
public class Architect extends Designer{
    private int stock;  //表示公司奖励的股票数量
    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus,int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

//    @Override
//    public String toString() {
//        return "Architect{" +
//                "stock=" + stock +
//                "} " + super.toString();
//    }
}
