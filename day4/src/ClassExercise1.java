import java.util.Scanner;

public class ClassExercise1 {
    public static void main(String[] args) {
        int a = 3;
        int x = 100;
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            default:
                x += 34;
                break;
        }
        //5. 使用for循环遍历100以内的奇数，并计算所有的奇数的和并输出
        System.out.println(x);
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
                System.out.println(i);
                System.out.println("sum = " + sum);
            }
        }
        //定义三个int型变量并赋值，使用三元运算符或者if-else获取这三个数中的较大数的实现
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个数");
        int num3 = scanner.nextInt();
        int max = 0;
        if (num1 >= num2 && num1 >= num3){
            max = num1;
        }
        else if(num2 >=num1 && num2 >=num3){
            max = num2;
        }
        else{
            max = num3;
        }
        System.out.println("三个数中最大的是"+max);
    }

}
