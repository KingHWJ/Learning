import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    // 猜数字小游戏

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int x = r.nextInt(100) + 1;
        int num = inputNum(sc);

        while (true) {
            if (num > x) {
                System.out.println("太大了，请重新输入");
                num = inputNum(sc);
            } else if (num < x) {
                System.out.println("太小了，请重新输入");
                num = inputNum(sc);
            } else if (num == x){
                System.out.println("恭喜你，答对了");
                break;
            }

        }
    }

    public static int inputNum(Scanner sc){
        System.out.print("请输入你的数字：");
        return sc.nextInt();

    }
}
