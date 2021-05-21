import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) {
//        //while遍历100以内的偶数
//        int i = 1;
//        while (i <= 100) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
        //从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
        Scanner scanner = new Scanner(System.in);
        int negCount = 0;
        int posCount = 0;
        while (true) {
            int number1 = scanner.nextInt();
            if (number1 != 0) {
                if (number1 < 0) {
                    negCount += 1;
                } else {
                    posCount += 1;
                }
            }
            else {
                System.out.println("你输入了零，所以跳出了程序");
                break;
            }
        }
        System.out.println("negCount = " + negCount);
        System.out.println("posCount = " + posCount);

    }
}
