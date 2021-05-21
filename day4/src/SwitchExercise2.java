import java.util.Scanner;

public class SwitchExercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        switch(score / 20){
            case 0:
            case 1:
            case 2:
                System.out.println("没有及格");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("及格了");
                break;
        }
        //更优解
        switch(score / 60){
            case 0:
                System.out.println("没及格");
            case 1:
                System.out.println("及格了");
        }
    }
}
