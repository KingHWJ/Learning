import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        Random r = new Random();

        int num = r.nextInt();
        System.out.println("输入的随机数是：" + num);

        int num2 = r.nextInt(10);
        System.out.println("输入的随机数是：" + num2);

        for (int i = 0; i <= 100; i++) {
            int num3 = r.nextInt(10);
            System.out.println(num3);
        }
    }
}
