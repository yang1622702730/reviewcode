import java.util.Scanner;

public class SwitchExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        char change_Big_Letter = ' ';
        switch (letter) {
            case "a":
                change_Big_Letter = letter.charAt(0);
                System.out.println(change_Big_Letter);
                break;

            case "b":
                change_Big_Letter = letter.charAt(0);
                System.out.println(change_Big_Letter);
                break;
            case "c":
                change_Big_Letter = letter.charAt(0);
                System.out.println(change_Big_Letter);
                break;
            case "d":
                change_Big_Letter = letter.charAt(0);
                System.out.println(change_Big_Letter);
                break;
            case "e":
                change_Big_Letter = letter.charAt(0);
                System.out.println(change_Big_Letter);
                break;
            default:
                System.out.println("暂时还不提供转换");
        }
    }
}
