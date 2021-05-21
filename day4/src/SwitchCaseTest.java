public class SwitchCaseTest {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other");
                break;
        }
        String choice_Season = "summer";
        switch (choice_Season) {
            case "spring":
                System.out.println("春天");
                break;
            case "summer":
                System.out.println("夏天");
                break;
            case "fall":
                System.out.println("秋天");
                break;
            case "winter":
                System.out.println("冬天");
                break;
            default:
                System.out.println("没有这个季节");
                break;
        }
    }
}
