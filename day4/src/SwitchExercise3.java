import java.util.Scanner;

public class SwitchExercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int mouth = scanner.nextInt();
        switch(mouth){
            case 3:
            case 4:
            case 5:
                System.out.println("现在属于三四五月份");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("现在属于六七八月份");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("现在属于九十十一月份");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("现在属于十二一二月份");
                break;

        }
    }
}
