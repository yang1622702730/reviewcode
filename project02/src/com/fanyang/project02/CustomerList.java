package com.fanyang.project02;

/**
 * @program: project2
 * @description: CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 * @author: FanYang
 * @create: 2021-05-19 15:07
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     * @Description: 用途：构造器，用来初始化customers数组
     * @Prame: [totalCustomer]
     * @return:
     * @author: FanYang
     * @time:
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * @Description: 用途：将参数customer添加到数组中最后一个客户对象记录之后
     * @Prame: [customer]
     * @return: boolean
     * @author: FanYang
     * @time:
     */
    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total++] = customer;
            return true;
        } else {
            return false;
        }
    }

    /**
     * @Description: 用途：用参数customer替换数组中由index指定的对象
     * @Prame: [index, cust]
     * @return: boolean
     * @author: FanYang
     * @time:
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index > 0 && index < total) {
            customers[index] = customer;
            return true;
        }
        return false;
    }

    /**
     * @Description: 用途：从数组中删除参数index指定索引位置的客户对象记录
     * @Prame: [index]
     * @return: boolean
     * @author: FanYang
     * @time:
     */
    public boolean deleteCustomer(int index) {
        if (index >= 0 && index < customers.length) {
            for (int i = index; i < customers.length - 1; i++) {
                customers[i] = customers[i + 1];
            }
//            customers[total- 1] = new Customer("test",'n',21,"2144","12414");
              customers[total--] = null;
            return true;
        }
        return false;
    }

    /**
     * @Description:用途：返回数组中记录的所有客户对象
     * @Prame: []
     * @return: com.fanyang.project02.Customer[]
     * @author: FanYang
     * @time:
     */
    public Customer[] getAllCustomers() {
        Customer[] customer = new Customer[total];
        for (int i = 0; i < total; i++) {
            customer[i] = customers[i];
        }
        return customer;
    }

    /**
     * @Description: 用途：返回参数index指定索引位置的客户对象记录
     * @Prame: [index]
     * @return: com.fanyang.project02.Customer
     * @author: FanYang
     * @time:
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) return null;

        return customers[index];
    }

    public int getTotal() {
        return this.total;
    }

    /*    public static void main(String[] args) {
        CustomerList customerList = new CustomerList(4);
        Customer customer1 = new Customer("fanyang1",'男',21,"12312344","162223123@qq.com");
        Customer customer2 = new Customer("fanyang2",'男',21,"12312344","162223123@qq.com");
        Customer customer3 = new Customer("fanyang3",'男',21,"12312344","162223123@qq.com");
        Customer customer4 = new Customer("fanyang4",'男',21,"12312344","162223123@qq.com");
        Customer customer5 = new Customer("liutianbo",'男',20,"17897894","167689123@qq.com");
        customerList.addCustomer(customer1);
        customerList.addCustomer(customer2);
        customerList.addCustomer(customer3);
        customerList.addCustomer(customer4);
        System.out.println(customerList.getCustomer(2).toString());
        customerList.deleteCustomer(1);
        System.out.println(customerList.getCustomer(1).toString());
        System.out.println(customerList.getCustomer(2).toString());
        customerList.replaceCustomer(2,customer5);
        System.out.println(customerList.getCustomer(2).toString());
    }*/
}
