package com.example.review;

import java.util.Scanner;
/*使用条件结构实现，如果用户名等于字符‘青’，密码等于数字‘123’，
        就输出“欢迎你，青”，否则就输出“对不起，你不是青”。*/
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名");
            String username = scanner.next();
            System.out.println("请输入密码");
            String password = scanner.next();
            if (username.equals("青") && password.equals("yangfan666")) {
                System.out.println("欢迎您");
                break;
            } else {
                System.out.println("对不起输入错误");
            }
        }
    }
}
