package com.fanyang.project02;

/**
 * @program: day8
 * @description: Bank的属性和方法
 * @author: FanYang
 * @create: 2021-05-18 23:41
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer = 0;

    public Bank() {
        customers = new Customer[10];
    }

    /**
     * @Description: addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer 对象，然后把
     * 它放到 customer 数组中。还必须把 numberOfCustomer 属性的值加 1。
     * @Prame: [firstName, lastName]
     * @return: void
     * @author: FanYang
     * @time:
     */
    public void addCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customers[numberOfCustomer] = customer;
        numberOfCustomer ++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * @Description: getCustomer 方法返回与给出的 index 参数相关的客户。
     * @Prame: [index]
     * @return: com.fanyang.project02.Customer
     * @author: FanYang
     * @time:
     */
    public Customer getCustomer(int index) {
        if (index > 0 && index < numberOfCustomer) {
            return customers[index];
        }
        else {
            return null;
        }
    }


}
