package com.exemple.exercise;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//练习：
//1、从键盘输入本组学员的成绩，放到数组中
//2、用for循环显示所有学员的成绩
//3、排序：从低到高
//4、查找是否有正好60分的，如果有返回位置
//5、复制成绩最低三名构成新数组
//6、用工具类打印成绩最低三名成绩
public class UseArrayClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的人数");
        int number = scanner.nextInt();
        int[] score = new int[number];
        for (int i = 0;i<score.length;i++){
            System.out.println("请输入第"+(i+1)+"位学生的成绩");
            score[i] = scanner.nextInt();
        }
        for (int i = 0;i<score.length;i++){
            System.out.print(score[i]+"\t");
        }
        System.out.println();
        Arrays.sort(score);
        for (int i = 0;i<score.length;i++){
            System.out.print(score[i]+"\t");
        }
        System.out.println();
        System.out.println("输入你要查找的成绩");
        int findScore = scanner.nextInt();
        for (int i = 0;i<score.length;i++){
            if (score[i]==findScore){
                System.out.println("找到了"+findScore+"的位置为"+i);
            }
        }
        int[] newArray = Arrays.copyOfRange(score,0,3);
        System.out.println("成绩最低的三位同学得分是"+Arrays.toString(newArray));

    }
}
