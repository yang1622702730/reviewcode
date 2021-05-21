import java.util.Scanner;

public class EarlyProjectTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;
        int earth = 0;
        int pay = 0;
        String detail = "";
        String details = "";
        int chooseNumber = 0;
        do {
            System.out.println("————————————————家庭收支记账软件—————————————————————");
            System.out.println("——————————————————1:收支明细——————————————————————————");
            System.out.println("——————————————————2:登记收入——————————————————————————");
            System.out.println("——————————————————3:登记支出————————————————————————");
            System.out.println("——————————————————4:退   出—————————————————————————");
            System.out.println("——————————————————请选择1-4————————————————————————");
            System.out.println("——————————————————————————————————————————————————");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("--------当前收支明细记录--------");
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("请输入收入金额");
                    earth = scanner.nextInt();
                    balance += earth;
                    System.out.println("请输入收支说明");
                    detail = scanner.next();
                    System.out.println("现在的余额为" + balance + "说明:" + detail);
                    System.out.println("登记完成");
                    details += "balance = " + balance + "  earth = " + earth + "  detail = " + detail + "\n";
                    break;
                case 3:
                    System.out.println("请输入支出金额");
                    pay = scanner.nextInt();
                    balance -= pay;
                    System.out.println("请输入收支说明");
                    detail = scanner.next();
                    System.out.println("现在的余额为" + balance + "说明:" + detail);
                    System.out.println("登记完成");
                    details += "balance = " + balance + "  pay = " + pay + "  detail = " + detail + "\n";
                    break;
                case 4:
                    System.out.println("确认是否退出(1退出，0取消)");
                    chooseNumber = scanner.nextInt();
                    if (chooseNumber == 1) {
                        System.out.println("正在退出");
                    } else if (chooseNumber == 0) {
                        System.out.println("取消退出成功");
                    }

            }
            if (chooseNumber == 1) {
                System.out.println("退出成功");
                break;
            }
        } while (true);

    }
}
