package com.fanyang.view;

import com.fanyang.control.CRUDCustomer;
import com.fanyang.model.Customer;

import java.util.Scanner;

/**
 * @program: reviewproject03
 * @description:
 * @author: FanYang
 * @create: 2021-07-21 20:32
 */
public class Mains {
    public static void main(String[] args) {
        int index;

        CRUDCustomer crudCustomer = new CRUDCustomer(1);
        boolean isFlag = true;
        while (isFlag) {
            Scanner scanner = new Scanner(System.in);
            Menu.showChoice();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Customer customer1 = crudCustomer.inputInformation();
                    if (CRUDCustomer.total >=crudCustomer.customers.length){
                        System.out.println("超出索引");
                        break;
                    }
                    crudCustomer.addCustomer(customer1);
                    break;
                case 2:
                    System.out.println("请输入需要更改的用户索引值");
                    index = scanner.nextInt();
                    crudCustomer.replaceCustomer(index, crudCustomer.customers[index]);
                    break;
                case 3:
                    System.out.println("请输入需要删除的用户索引值");
                    index = scanner.nextInt();
                    crudCustomer.deleteCustomer(index);
                    break;
                case 4:
                    System.out.println("正在获取所有的客户信息");
                    crudCustomer.getAllCustomers();
                    break;
                case 5:
                    System.out.println("请输入你想要获取的客户ID");
                    index = scanner.nextInt();
                    if (crudCustomer.getCustomer(index) ==null){
                        System.out.println("当前没有这个用户");
                    } else{System.out.println(crudCustomer.getCustomer(index).toString());}
                    System.out.println("——————————————————————————————————————————————");
                    break;
                case 6:
                    System.out.println("请确定是否退出输入Y/N");
                    String choices = scanner.next();
                    if (choices.equals("Y")) {
                        System.out.println("真在退出中.......");
                        isFlag = false;
                        break;
                    } else {
                        System.out.println("真在取消退出......");
                        break;
                    }
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
}
