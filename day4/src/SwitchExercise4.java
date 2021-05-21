/**
 * 判断一年中某个月份是第多少天
 */

import java.util.Scanner;

public class SwitchExercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入天数");
        int day = scanner.nextInt();
        int sumDays = 0;
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        //方法一
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            switch (month) {
//                case 12:
//                    sumDays += 30;
//                case 11:
//                    sumDays += 31;
//                case 10:
//                    sumDays += 30;
//                case 9:
//                    sumDays += 31;
//                case 8:
//                    sumDays += 31;
//                case 7:
//                    sumDays += 30;
//                case 6:
//                    sumDays += 31;
//                case 5:
//                    sumDays += 30;
//                case 4:
//                    sumDays += 31;
//                case 3:
//                    sumDays += 29;
//                case 2:
//                    sumDays += 31;
//                case 1:
//                    sumDays += day;
//                    break;
//                default:
//                    System.out.println("输入错误");
//            }
//            System.out.println(sumDays);
//        }
//        else {
//            switch (month) {
//                case 12:
//                    sumDays += 30;
//                case 11:
//                    sumDays += 31;
//                case 10:
//                    sumDays += 30;
//                case 9:
//                    sumDays += 31;
//                case 8:
//                    sumDays += 31;
//                case 7:
//                    sumDays += 30;
//                case 6:
//                    sumDays += 31;
//                case 5:
//                    sumDays += 30;
//                case 4:
//                    sumDays += 31;
//                case 3:
//                    sumDays += 28;
//                case 2:
//                    sumDays += 31;
//                case 1:
//                    sumDays += day;
//                    break;
//                default:
//                    System.out.println("输入错误");
//            }
//            System.out.println(sumDays);
//        }
        //方法二
        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    sumDays += 29;
                } else {
                    sumDays += 28;
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
                break;
            default:
                System.out.println("输入错误");
        }
        System.out.println(sumDays);
    }
}

