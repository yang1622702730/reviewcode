import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int random_Number = (int) (Math.random() * 90 + 10);
        System.out.println(random_Number);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个两位数");
        int input_Number = scanner.nextInt();
        int random_Number_Decade = random_Number / 10;
        int random_Number_Digit = random_Number % 10;
        int input_Number_Decade = input_Number / 10;
        int input_Number_Digit = input_Number % 10;
        if (random_Number == input_Number) {
            System.out.println("获得奖金10000");
        } else if (random_Number_Decade == input_Number_Digit && random_Number_Digit == input_Number_Decade) {
            System.out.println("获得奖金3000");
        } else if (random_Number_Digit == input_Number_Digit || random_Number_Decade == input_Number_Decade) {
            System.out.println("获得奖金1000");
        } else if (random_Number_Decade == input_Number_Digit || random_Number_Digit == input_Number_Decade) {
            System.out.println("将获得奖励500");
        }
        else {
            System.out.println("什么也没有，血亏");
        }

    }
}
