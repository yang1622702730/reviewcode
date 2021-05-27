package com.fanyang.exercise7;

import org.junit.jupiter.api.Test;

/**
 * @program: day9
 * @description: Employee的测试类
 * @author: FanYang
 * @create: 2021-05-27 20:00
 */
public class EmployeeTest {
    @Test
    public void testManager(){
        Employee manager = new Employee("杨凡",1,20000);
        System.out.println(manager.bonus(2));
    }
    @Test
    public void testEmployee(){
        Employee manager = new Employee("李爽",2,10000);
        System.out.println(manager.bonus(1.5));
    }
}
