package com.fanyang.study;

/**
 * @program: day9
 * @description: Test
 * @author: FanYang
 * @create: 2021-06-01 23:35
 */
public class Test {

    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Sub();
    }
}
class Base{
    Base(){
        method(100);
    }
    public void method(int i){
        System.out.println("base : " + i);
    }
}
class Sub extends Base{
    Sub(){
        super();
        super.method(70);
    }
    public void method(int j){
        System.out.println("sub : " + j);
    }
}
