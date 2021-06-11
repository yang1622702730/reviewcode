package com.fanyang.team.domain;

/**
 * @program: project03
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 14:18
 */
public class Designer extends Programmer{
    private double bonus;//表示奖金

    public Designer(int id, String name, int age, double salary, Equipment equipment,double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getWork(){
        return "设计师\t"+getStatus()+ "\t"+getBonus()+"\t"  +"\t\t";
    }
    @Override
    public String toString() {
        return prints()+getWork()+ getEquipment().getDescription();
    }
}
