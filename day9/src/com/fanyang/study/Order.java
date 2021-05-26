package com.fanyang.study;

/**
 * @program: day9
 * @description: Order的操作
 * @author: FanYang
 * @create: 2021-05-26 15:17
 */
public class Order {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Order() {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Order) {
            Order order = (Order)obj;
            return this.id == order.id &&
                    this.name.equals(order.name);
        }
        return false;
    }
}
