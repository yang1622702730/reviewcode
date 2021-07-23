package com.fanyang.control;

import com.fanyang.model.Customer;

import java.util.Scanner;

/**
 * @program: reviewproject03
 * @description:
 * @author: FanYang
 * @create: 2021-07-21 20:33
 */
public class CRUDCustomer {
    public  Customer customers[];
    public static int total = 0;
    Scanner scanner = new Scanner(System.in);

    public CRUDCustomer(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * @Description:添加用户的信息
     * @Param: []
     * @return: com.fanyang.model.Customer
     * @author: FanYang
     * @time: 2021/7/22 14:19
     */
    public Customer inputInformation() {
        System.out.println("请输入名字");
        String name = scanner.next();
        System.out.println("请输入性别");
        String gender = scanner.next();
        System.out.println("请输入年纪");
        int age = scanner.nextInt();
        System.out.println("请输入电话号码");
        String phoneNumber = scanner.next();
        System.out.println("请输入电子邮箱");
        String email = scanner.next();
        return new Customer(name, gender, age, phoneNumber, email);
    }

    private void inputEnter(String input){
        if (input.equals("")){
            System.out.println("没有做出更改,保留原始值");
        }
    }
    /**
     * @Description: 修改用户的信息
     * @Param: [customer]
     * @return: com.fanyang.model.Customer
     * @author: FanYang
     * @time: 2021/7/22 14:19
     */
    public Customer modifyInformation(Customer customer) {
        System.out.println("请输入名字，如果不修改请输入Enter");
        scanner.nextLine();
        String name = scanner.nextLine();
        if (name.length()>0){
            customer.setName(name);
        }else {
            inputEnter(name);
        }
//        if (name.equals("")) {
//            System.out.println("没修改名字");
//        } else {
//            customer.setName(name);
//        }
        System.out.println("请输入性别,如果不修改请输入Enter");
        String gender = scanner.nextLine();

//        if (gender.equals("")) {
//            System.out.println("没修改性别");
//        } else {
//            customer.setGender(gender);
//        }
        System.out.println("请输入年纪,如果不修改请输入Enter");
        int age;
        String ages = scanner.nextLine();

        if (ages.equals("")) {
            System.out.println("没修改年纪");
        } else {
            age = Integer.parseInt(ages);
            customer.setAge(age);
        }
        System.out.println("请输入电话号码,如果不修改请输入Enter");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.equals("")) {
            System.out.println("没修改电话");
        } else {
            customer.setPhoneNumber(phoneNumber);
        }
        System.out.println("请输入电子邮箱,如果不修改请输入Enter");
        String email = scanner.nextLine();
        if (email.equals("")) {
            System.out.println("没修改电子邮箱");
        } else {
            customer.setEmail(email);
        }
        return customer;
       /* System.out.println("请输入名字，如果不修改请输入N");
        String name = scanner.next();
        if (name.equals("N")) {
            System.out.println("没修改名字");
        } else {
            customer.setName(name);
        }
        System.out.println("请输入性别,如果不修改请输入N");
        String gender = scanner.next();
        if (gender.equals("N")) {
            System.out.println("没修改性别");
        } else {
            customer.setGender(gender);
        }
        System.out.println("请输入年纪,如果不修改请输入N");
        int age;
        String ages = scanner.next();

        if (ages.equals("N")) {
            System.out.println("没修改年纪");
        } else {
            age = Integer.parseInt(ages);
            customer.setAge(age);
        }
        System.out.println("请输入电话号码,如果不修改请输入N");
        String phoneNumber = scanner.next();
        if (phoneNumber.equals("N")) {
            System.out.println("没修改电话");
        } else {
            customer.setPhoneNumber(phoneNumber);
        }
        System.out.println("请输入电子邮箱,如果不修改请输入N");
        String email = scanner.next();
        if (email.equals("N")) {
            System.out.println("没修改电子邮箱");
        } else {
            customer.setEmail(email);
        }
        return customer;*/
    }

    /**
     * @Description: 添加用户
     * @Param: [customer]
     * @return: void
     * @author: FanYang
     * @time: 2021/7/21 22:45
     */

    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            System.out.println("数组已满");
            return false;
        } else {
            customers[total] = customer;
            total++;
            System.out.println("添加成功");
            System.out.println(customer.toString());
            return true;
        }

    }

    /**
     * @Description: 更改用户的数据
     * @Param: [index, customer]
     * @return: boolean
     * @author: FanYang
     * @time: 2021/7/22 14:58
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index >= total) {
            System.out.println("超出索引");
            return false;
        } else {
            customers[index] = modifyInformation(customer);
            System.out.println(customer.toString());
            return true;
        }
    }

    /**
     * @Description:删除客户
     * @Param: [args]
     * @return: void
     * @author: FanYang
     * @time: 2021/7/22 15:05
     */
    public boolean deleteCustomer(int index) {
        if (index > customers.length || index<=0) {
            System.out.println("超出索引范围，请重新选择");
            return false;
        }
        for (int i = index-1; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[total-1] = null;
        total--;
        System.out.println("删除成功");
        return true;
    }

    /**
     * @Description:返回数组中记录的所有客户对象
     * @Param: [args]
     * @return: void
     * @author: FanYang
     * @time: 2021/7/22 15:09
     */
    public Customer[] getAllCustomers() {
        if (customers == null) {
            System.out.println("现在没有一个用户");
            return null;
        }
        System.out.println("打印所有的客户信息");
        System.out.println("——————————————————————————————————————————————");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Gender" + "\t" + "Age" + "\t\t" + "PhoneNumber" + "\t\t" + "Email" + "\t");
        detail();
        System.out.println("——————————————————————————————————————————————");
        return customers;
    }

    /**
     * @Description: 根据提供的索引值查询用户的信息
     * @Param: [index]
     * @return: com.fanyang.model.Customer
     * @author: FanYang
     * @time: 2021/7/22 16:11
    */
    public Customer getCustomer(int index) {
        if (index > total) {
            System.out.println("超出索引范围");
            return null;
        }
        System.out.println("——————————————————————————————————————————————");
        System.out.println("成功查询到客户信息");
        return customers[index - 1];
    }

    /**
     * @Description:打印每个用户的具体信息
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/22 16:12
    */
    public void detail() {
        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + "\t" + customers[i].getName() + "\t" + customers[i].getGender() + "\t\t" + customers[i].getAge()
                    + "\t\t" + customers[i].getPhoneNumber() + "\t\t" + customers[i].getEmail() + "\t");
        }
    }


}

