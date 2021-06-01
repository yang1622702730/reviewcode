package com.fanyang.study;

/**
 * @program: day10
 * @description: 单例模式的饿汉式
 * @author: FanYang
 * @create: 2021-06-01 16:59
 */
public class SingletonTest2 {
    public static void main(String[] args){
        Order2 order1 = Order2.getInstance();
        Order2 order2 = Order2.getInstance();
        System.out.println(order1==order2);
    }
}
class Order2{
    private Order2(){}
    private static Order2 instance = new Order2();
    public static Order2 getInstance(){
        return instance;
    }
}
