public class IfTest {
    public static void main(String[] args) {
        int heartBeats = 79;
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("可能有问题，需要进一步检查！！");
        } else {
            System.out.println("体检正常");
        }
        int age = 23;
        if (age > 18) {
            System.out.println("可以看成人电影了！！！");
        }
        else{
            System.out.println("现在还在看动画片！！！");
        }
        age = 24;
        if(age <0){
            System.out.println("你还没有出生");
        }
        else if(age <18){
            System.out.println("你现在是未成年");
        }
        else if(age <35){
            System.out.println("你现在处于壮年期");
        }
        else {
            System.out.println("你现在岁数大了");
        }
    }
}
