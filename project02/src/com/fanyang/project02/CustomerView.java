package com.fanyang.project02;

import java.util.Scanner;

/**
 * @program: project2
 * @description: CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author: FanYang
 * @create: 2021-05-19 15:07
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(2);

    public static void main(String[] args) {
        CustomerView customerview = new CustomerView();
        customerview.enterMainMenu();
    }


    Scanner scanner = new Scanner(System.in);

    /**
     * @Description: 用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法
     * @Prame: []
     * @return: void
     * @author: FanYang
     * @time:
     */
    public void enterMainMenu() {

        boolean isFlog = true;
        label:
        while (isFlog) {
            System.out.println("------------客户信息管理软件-----------");
            System.out.println("--------------1.添加客户--------------");
            System.out.println("--------------2.修改客户--------------");
            System.out.println("--------------3.删除客户--------------");
            System.out.println("--------------4.客户列表--------------");
            System.out.println("--------------5.退   出---------------");
            System.out.println("------------请选择（1-5）：------------");
            int chooses = scanner.nextInt();
            switch (chooses) {
                case 1:
                    addNewCustomer();
                    continue;
                case 2:
                    System.out.println();
                    continue;
                case 3:
                    deleteCustomer();
                    continue;
                case 4:
                    listAllCustomers();
                    continue;
                case 5:
                    System.out.println("请输入y/n确认是否退出");
                    String choose = scanner.next();
                    if (choose == "y" || choose == "Y") {
                        System.out.println("正在结束程序");
                        isFlog = false;
                    } else if (choose == "n" || choose == "N") {
                        System.out.println("成功取消退出");
                    }
                    continue;
                default:
                    System.out.println("请重新选择");
                    continue label;

            }
        }
    }

    private void addNewCustomer() {
        Customer customer = new Customer();
        System.out.println("请输入需要添加的客户的名字");
        String name = scanner.next();
        customer.setName(name);
        System.out.println("请输入用户的性别");
        String gender = scanner.next();
        char gender1 = gender.charAt(0);
        customer.setGender(gender1);
        System.out.println("请输入用户的年龄");
        int age = scanner.nextInt();
        customer.setAge(age);
        System.out.println("请输入电话");
        String phone = scanner.next();
        customer.setPhone(phone);
        System.out.println("请输入邮箱");
        String email = scanner.next();
        customer.setEmail(email);
        boolean flag = customerList.addCustomer(customer);
        if (flag) {
            System.out
                    .println("--------------添加完成----------------");
        } else {
            System.out.println("------------记录已满,无法添加--------");
        }
    }

    private void modifyCustomer() {

    }

    public void deleteCustomer() {
        System.out.println("请输入需要删除的用户的id");
        System.out.println("输入-1退出");
        int deleteIndex = scanner.nextInt();
        if (deleteIndex >= 1 && deleteIndex <= customerList.getAllCustomers().length) {
            boolean flog = customerList.deleteCustomer(deleteIndex - 1);
            if (flog == true) {
                System.out.println("-------------删除完成----------");
            } else {
                System.out.println("---无法找到指定客户,删除失败-----");
            }
        } else if (deleteIndex == -1) {
            System.out.println("输入y确认退出,输入n取消退出");
            String choose = scanner.next();
            if (choose == "y" || choose == "Y") {
                System.out.println("退出成功");
                return;
            } else if (choose == "n" || choose == "N") {
                System.out.println("取消退出中");
            }
        } else {
            System.out.println("没有这个ID的人，请重新输入id");
            deleteCustomer();
        }
    }


    private void listAllCustomers() {
        Customer[] customers = customerList.getAllCustomers();
        System.out.println(customerList.getTotal());
        if (customers.length == 0) {
            System.out.println("没有客户信息");
        } else {
            System.out.println("ID\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            for (int i = 0; i < customerList.getTotal(); i++) {
                System.out.println((i + 1) + "\t" + customers[i].getName() + "\t" + customers[i].getGender() + "\t" + customers[i].getAge()
                        + "\t\t" + customers[i].getPhone() + "\t" + customers[i].getEmail());

            }
        }
        System.out.println("----------客户列表展示完成--------");
    }

}
