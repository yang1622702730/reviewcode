public class NestCycle {
    public static void main(String[] args) {
//         for (int i = 0;i <=6 ;i++){
//             for (int j = 0;j<=3;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for (int i = 1;i<=5;i++){
//             for (int j = 1;j <=i;j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//        for (int i = 1;i<=4;i++){
//            for (int j = 1;j <= 5-i;j++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= 5; i++) {

            for (int k = 1; k <= 5-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int k = 1; k <= 5-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        // 上半部分
//        for (int i = 0; i < 5; i++) {
//            // 输出“-”
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print(" ");
//            }
//
//            // 输出“* ”
//            for (int k = 0; k < i + 1; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // 下半部分
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 4 - i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        }
}
