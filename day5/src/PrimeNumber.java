public class PrimeNumber {
    public static void main(String[] args) {
//        //方法一
//        long start = System.currentTimeMillis();
//        boolean isFlog = true;
//        for (int i = 2; i < 100000; i++) {
//            isFlog = true;
//            for (int j = 2; j <= i -1  ; j++) {
//                if (i % j == 0) {
//                    isFlog = false;
//                    break;
//                }
//            }
//            if (isFlog ==true){
//                System.out.println(i);
//            }
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("总共用了"+(end - start)+"s");//89s //只加了break用时30s//加了break和i/2后19s
        //方法二
        long start = System.currentTimeMillis();
        boolean isFlog = true;
        label : for (int i = 2; i < 100000; i++) {
            isFlog = true;
            for (int j = 2; j <= Math.sqrt(i)  ; j++) {
                if (i % j == 0) {
                   continue label;
                }
            }
//            if (isFlog ==true){
//                System.out.println(i);
//            }
       }
        long end = System.currentTimeMillis();
        System.out.println("总共用了"+(end - start)+"s");
    }
}
