public class Exercise {
    public static void main(String[] args) {
        //exercise1
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int max1 = (num1 > num2) ? num1 : num2;
        int max2 = (max1 > num3) ? max1 : num3;
        System.out.println("max2 = " + max2);

        //exercise2
        double num4 = 24.5;
        double num5 = 16.7;
        if (num4 > 10.0 && num5 < 20.0) {
            System.out.println("sum = " + (num4 + num5));
        } else {
            System.out.println("有条件不满足");
        }
        //exercise3
        int num6 = 10;
        int num7 = 20;
        int temp = 0;
        System.out.println("num6 = " + num6 + ",num7 = " + num7);
        temp = num6;
        num6 = num7;
        num7 = temp;
        System.out.println("num6 = " + num6 + ",num7 = " + num7);
    }
}
