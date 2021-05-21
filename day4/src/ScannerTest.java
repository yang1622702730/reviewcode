import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入num的值");
//        int num = scanner.nextInt();
//        System.out.println("num = " + num);
        //岳小鹏的奖品
//        System.out.println("请输入岳小鹏的成绩");
//        double score = scanner.nextDouble();
//        if (score == 100) {
//            System.out.println("将获得奖励BMW一台");
//        }
//        else if (80 < score && score <= 99){
//            System.out.println("将获得一台iPhone 12");
//        }
//        else if (60 < score && score <= 80){
//            System.out.println("将获得一台ipad");
//        }
//        else {
//            System.out.println("你什么都得不到， 并且会挨打");
//        }
        System.out.println("请输入三个整数的值");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
//        int max_Num1 = (num1 > num2) ? num1 :num2;
//        int max_Num2 = (max_Num1 > num3) ? max_Num1 : num3;
//        if (max_Num2 == max_Num1){
//            middle_Num =
//        }
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            } else {
                System.out.println(num1 + " > " + num3 + " > " + num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2 + " > " + num1 + " > " + num3);
            } else {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            }
        } else if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            } else {
                System.out.println(num3 + " > " + num2 + " > " + num1);
            }
        }
    }
}
