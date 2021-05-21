package com.fanyang.project02;

import java.util.Scanner;

/**
 * @program: project2
 * @description: CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author: FanYang
 * @create: 2021-05-19 15:07
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

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
                    modifyCustomer();
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
                    if (choose.equals("y") || choose.equals("Y")) {
                        System.out.println("正在结束程序");
                        isFlog = false;
                    } else if (choose.equals("n") || choose.equals("N")) {
                        System.out.println("成功取消退出");
                    }
                    continue;
                default:
                    System.out.println("请重新选择");
                    continue label;

            }


        }
    }

    /**
     * @Description: 添加客户信息
     * @Prame: []
     * @return: void
     * @author: FanYang
     * @time:
     */
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

    /**
     * @Description:修改用户信息
     * @Prame: []
     * @return: void
     * @author: FanYang
     * @time:
     */
    private void modifyCustomer() {
        System.out.println("输入你需要修改的用户ID");
        int index = scanner.nextInt();
        Customer customer = customerList.getCustomer(index - 1);
        boolean isFlog = true;
        while (isFlog) {
            System.out.println("输入你需要修改的信息");
            System.out.println("输入1，修改用户名字");
            System.out.println("输入2，修改用户性别");
            System.out.println("输入3，修改用户年纪");
            System.out.println("输入4，修改用户电话号码");
            System.out.println("输入5，修改用户邮箱");
            System.out.println("输入6，结束修改");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("现有的用户名为" + customer.getName());
                    System.out.println("请输入新的用户名");
                    customer.setName(scanner.next());
                    break;
                case 2:
                    System.out.println("现有的性别为" + customer.getGender());
                    System.out.println("请输入新的性别");
                    String gender = scanner.next();
                    char gender1 = gender.charAt(0);
                    customer.setGender(gender1);
                    break;
                case 3:
                    System.out.println("现有的年纪为" + customer.getAge());
                    System.out.println("请输入新的年纪");
                    customer.setAge(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("现有的电话为" + customer.getPhone());
                    System.out.println("请输入新的电话");
                    customer.setPhone(scanner.next());
                    break;
                case 5:
                    System.out.println("现有的邮箱为" + customer.getEmail());
                    System.out.println("请输入新的邮箱");
                    customer.setEmail(scanner.next());
                    break;
                case 6:
                    System.out.println("真在结束修改");
                    isFlog = false;
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
        boolean flag = customerList.replaceCustomer(index, customer);
        if (flag) {
            System.out
                    .println("--------------添加完成----------------");
        } else {
            System.out.println("------------记录已满,无法添加--------");
        }
    }

    /**
     * @Description: 根据提供的ID删除用户信息
     * @Prame: []
     * @return: void
     * @author: FanYang
     * @time:
     */
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
            if (choose.equals("y") || choose.equals("Y")) {
                System.out.println("退出成功");
                return;
            } else if (choose.equals("n") || choose.equals("N")) {
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
        if (customerList.getTotal() == 0) {
            System.out.println("没有客户信息");
        } else {
            System.out.println("ID\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            for (int i = 0; i < customerList.getTotal(); i++) {
                System.out.println((i + 1) + "\t" + customers[i].getName() + "\t\t" + customers[i].getGender() + "\t     " + customers[i].getAge()
                        + "\t\t   " + customers[i].getPhone() + "\t\t  " + customers[i].getEmail());

            }
        }
        System.out.println("----------客户列表展示完成--------");
    }

}
