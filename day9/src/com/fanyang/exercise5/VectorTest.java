package com.fanyang.exercise5;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Vector;

/**
 * @program: day9
 * @description: Vector的测试类
 * @author: FanYang
 * @create: 2021-05-27 15:47
 */
public class VectorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector v = new Vector();
        int score = 0;
        for (;;){
            System.out.println("请输入学生的成绩（输入负数退出）");
            score = scanner.nextInt();
            if (score >100){
                System.out.println("分数不能大于一百");
                continue;
            }
            else if (score <0){
                System.out.println("真在退出数据添加");
                break;
            }
            else{
                Integer getScore = (Integer)score;
                v.addElement(getScore);
                continue;
            }
        }
        int max = 0;
        for (int i =0;i<v.size();i++){
            Object object =v.elementAt(i);
            Integer integer = (Integer)object;
            int number = (int)integer;
            if (max <number){
                max = number;
            }

        }
        char level;
        for (int i =0;i<v.size();i++){
            Object object =v.elementAt(i);
            Integer integer = (Integer)object;
            int number = (int)integer;
            if (max -number <=10){
                level = 'A';
            }
            else if (max -number <=20){
                level = 'B';
            }
            else if (max -number <=30){
                level = 'C';
            }
            else{
                level = 'D';
            }
            System.out.println("Student["+(i+1)+"],的等级为"+level);
        }

    }
}
