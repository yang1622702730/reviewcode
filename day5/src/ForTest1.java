public class ForTest1 {
    public static void main(String[] args) {
        //练习一
        int b = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println("hello world");
            b += 1;
            System.out.println(b);
        }
        //练习二
        int c = 0;
        for (System.out.println("hhhh"); c <= 3; System.out.println("aaaa"), c++) {
            System.out.println("bbbb");
        }
        //遍历100以内的偶数,并累加
        int sum = 0;
        int count = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
                sum += j;
                count += 1;
            }
        }
        System.out.println("sun = " + sum);
        System.out.println("count = "+ count);
    }
}
