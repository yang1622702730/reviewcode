import java.sql.SQLOutput;

public class Variable {
    public static void main(String[] args)
    {
        //整形
        byte b1 = 12;
        byte b2 = 127;
        System.out.println(b1);
        System.out.println(b2);
        byte b3 = -128;
        System.out.println(b3);
        byte b4 = 127;
        System.out.println(b4);
        short s1 = 128;
        int i1 = 128481472;
        long l1 = 2141123123L;
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        //单精度
        float f1 =  3.22222f;
        System.out.println(f1);
        double d1 = 1231231.213213;
        System.out.println(d1);
        //字符
        char c1 = 'a';
        System.out.println(c1);
        char c2 = 'A';
        System.out.println(c2);
        char c3 = '中';//一个中文占两个字节
        System.out.println(c3);
        char c4 = '\n';
        System.out.print("Hello" + c4);
        System.out.print("World");
        System.out.println();
        char c5 = '\u0044';
        System.out.println(c5);

        //布尔型
        boolean bl1 = true;
        System.out.println(bl1);
        boolean isMarried = true;
        if(isMarried){
            System.out.println("你不能来参加单身派对");
        }
        else {
            System.out.println("你可以来找女朋友");
        }

    }
}
