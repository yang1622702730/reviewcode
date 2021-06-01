package com.fanyang.study;

/**
 * @program: day10
 * @description: 单例模式的懒汉式
 * @author: FanYang
 * @create: 2021-06-01 16:56
 */
public class SingletonTest1 {
    public static void main(String[] args){
        Order1 order1 = Order1.getInstance();
        Order1 order2 = Order1.getInstance();
        System.out.println(order1==order2);

    }
}
class Order1{
    private Order1(){}
    private static Order1 instance = null;
    public static Order1 getInstance(){
        if (instance ==null) {
            instance = new Order1();
        }
        return instance;
    }
}
