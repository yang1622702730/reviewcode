package com.fanyang.exercise3;
/*参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的
        员工处理。该类包括：
        private成员变量wage和hour；
        实现父类的抽象方法earnings(),该方法返回wage*hour值；
        toString()方法输出员工类型信息及员工的name，number,birthday。*/

/**
 * @program: day10
 * @description:
 * @author: FanYang
 * @create: 2021-06-02 18:00
 */
public class HourlyEmployee extends Employee {
    private int wage;
    private int hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate myDate, int wage, int hour) {
        super(name, number, myDate);
        this.wage = wage;
        this.hour = hour;
    }

    /**
     * @Description: 用来计算小时工的工资
     * @Prame: []
     * @return: double
     * @author: FanYang
     * @time:
     */
    public double earnings() {
        return wage * hour;
    }

    /**
     * @Description: 用来打印员工信息
     * @Prame: []
     * @return: java.lang.String
     * @author: FanYang
     * @time:
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", number=" + getNumber() +
                ", myDate=" + getMyDate() +
                '}';
    }
}