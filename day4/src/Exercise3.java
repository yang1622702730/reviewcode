import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身高");
        double height = scanner.nextDouble();
        System.out.println("请输入你的财富值");
        int wealth = scanner.nextInt();
        System.out.println("是否长得帅");
        boolean handsome = scanner.nextBoolean();
        if (height > 180.0 && wealth > 1000 && handsome){
            System.out.println("我一定嫁给他");
        }
        else if (height > 180.0 || wealth > 1000 || handsome){
            System.out.println("嫁吧，比上不足，比下有余");
        }
        else{
            System.out.println("不嫁");

        }

    }
}

//什么是真正的白富美：身为女子，洁身自好为白，经济独立为富，内外兼修为美。
//什么是真正的高富帅：身为男子，大智如愚宠辱不惊是为高，大爱于心福泽天下为富，大略宏才智勇双全是为帅。
