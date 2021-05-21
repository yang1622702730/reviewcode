import java.util.Scanner;

public class ForExercise1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 150; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println(i + " foo biz baz");
            } else if (i % 3 == 0) {
                System.out.println(i + " foo");
            } else if (i % 5 == 0) {
                System.out.println(i + " biz");
            } else if (i % 7 == 0) {
                System.out.println(i + " baz");
            } else {
                System.out.println(i);
            }
        }
        //求任意两个数的最大公约数和最小公倍数
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入第一个数m = ");
//        int m = scanner.nextInt();
//        System.out.println("请输入第二个数n = ");
//        int n = scanner.nextInt();
//        int min = (m > n) ? n : m;
//        for (int i = min; i >= 1; i--) {
//            if (m % i == 0 && n % i == 0) {
//                System.out.println("最大公约数为" + i);
//                break;
//            }
//        }
//        int max = (m > n) ? m : n;
//        for (int i = max; i <= m * n; i++) {
//            if (i % m == 0 && i % n == 0) {
//                System.out.println("最小公倍数为" + i);
//                break;
//            }
//        }
        //打印1-100之间所有是7的倍数的整数的个数以及和
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                count += 1;
                sum += i;
            }
        }
        System.out.println("count = " + count + ",sum = " + sum);

        //水仙花
        for (int amount = 100; amount <= 999; amount++) {
            int indNumber = amount % 10;
            int decNumber = amount / 10 % 10;
            int hunNumber = amount / 100;
            if ((hunNumber * hunNumber * hunNumber + decNumber * decNumber * decNumber + indNumber * indNumber * indNumber) == amount) {
                System.out.println(amount + "这个水仙花很特殊");
            }

        }

    }
}
