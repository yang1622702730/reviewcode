public class CombineTrain {
    public static void main(String[] args) {
        //找出1000以内的所有完数如6=1+2+3
        int factor = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i /2   ; j++) {
                if (i % j == 0) {
                    factor += j;
                }
            }
            if (i == factor) {
                System.out.println(i + "是完数");
            }
            factor = 0;
        }
    }
}
