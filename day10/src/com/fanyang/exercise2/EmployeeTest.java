package com.fanyang.exercise2;

/**
 * @program: day10
 * @description:
 * @author: FanYang
 * @create: 2021-06-02 16:21
 */
public class EmployeeTest {
    public static void main(String[] args){
        Manager manager = new Manager();
        manager.work();
        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
