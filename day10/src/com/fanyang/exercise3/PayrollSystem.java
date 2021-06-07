package com.fanyang.exercise3;


/*定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
        类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
        型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本
        月是某个Employee对象的生日，还要输出增加工资信息。
        提示：
        //定义People类型的数组People c1[]=new People[10];
//数组元素赋值
        c1[0]=new People("John","0001",20);
        c1[1]=new People("Bob","0002",19);
//若People有两个子类Student和Officer，则数组元素赋值时，可以使父类类型的数组元素指向子类。
        c1[0]=new Student("John","0001",20,85.0);
        c1[1]=new Officer("Bob","0002",19,90.5);*/

import java.util.Scanner;

/**
 * @program: day10
 * @description:
 * @author: FanYang
 * @create: 2021-06-02 18:04
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<employee.length;i++){
//            System.out.println("请输入生日");     //用户自定义输入信息
//            MyDate myDate = new MyDate();
//            System.out.println("请先输入日份");
//            int day = scanner.nextInt();
//            myDate.setDay(day);
//            System.out.println("请先输入月份");
//            int month = scanner.nextInt();
//            myDate.setMonth(month);
//            System.out.println("请先输入年份");
//            int year = scanner.nextInt();
//            myDate.setYear(year);
            MyDate myDate = new MyDate(1999,10,15); //默认值
            System.out.println(myDate.toString());
//            employee[i] = new SalariedEmployee("yf",21,myDate,5000.0);
            employee[i]=new HourlyEmployee("yf",21,myDate,50,20);
            System.out.println(employee[i].earnings());
            System.out.println(employee[i].toString());
//            employee[i].setNumber(2);
//            employee[i].setName("yf");
//            employee[i].setMyDate(myDate);
//            System.out.println(i);
            System.out.println("***********");

        }
    }

}
