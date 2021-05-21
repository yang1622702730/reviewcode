import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        switch(score/10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("等级：D");
                break;
            case 6:
                System.out.println("等级：C");
                break;
            case 7:
            case 8:
                System.out.println("等级：B");
                break;
            case 9:
                System.out.println("等级：A");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
