package com.fanyang.exercises;

public class Customer {
    int id = 15641;
    String name = "fanYang";
    String numberPhone = "18723369961";
    String homeLocate = "江北区";

    /**
     * Description 获取用户信息
     * @return
     */
    public String say(){
        return (name + id + numberPhone+homeLocate);
    }
}
