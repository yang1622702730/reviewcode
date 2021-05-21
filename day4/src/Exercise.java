import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你家狗狗的年纪，我将为你转换为人的年纪");
        int dog_Age = scanner.nextInt();
        double reality_Age = 0.0;
        if (dog_Age <= 2 && dog_Age >=0) {
            reality_Age = dog_Age * 10.5;
            System.out.println("幼狗的实际年纪为"+reality_Age);
        }
        else if (dog_Age < 0){
            System.out.println("狗狗的年龄不能为负数");
        }
        else{
            reality_Age = 2 * 10.5 + (dog_Age-2)*4;
            System.out.println("成年狗狗的实际年纪为"+reality_Age);
        }
    }
}
