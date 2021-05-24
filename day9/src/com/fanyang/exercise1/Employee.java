package com.fanyang.exercise1;

/**
 * @program: day9
 * @description: Employee的相关操作
 * @author: FanYang
 * @create: 2021-05-24 16:11
 */
public class Employee extends Person{
    private String office;
    private double wage;
    private String hireDate;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(String office, double wage, String hireDate) {

        this.office = office;
        this.wage = wage;
        this.hireDate = hireDate;
    }
    public Employee(){

    }

    public Employee(String name, String address, String telPhone, String emile, String office, double wage, String hireDate) {
        super("杨凡", "江北", "110", "120");
        this.office = office;
        this.wage = wage;
        this.hireDate = hireDate;
    }
}
