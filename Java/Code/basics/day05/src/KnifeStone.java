import java.util.Scanner;
import java.util.Random;

public class KnifeStone {
    public static void main(String[] args) {
        // 剪刀石头布游戏
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入剪刀（1）石头（2）布（3）： ");
        int player = scanner.nextInt();

        // 电脑
        var comp = (int)(Math.random()*3 + 1);

        switch (player){
            case 1 :
                switch (comp){
                    case 1 -> System.out.println("电脑出剪刀，打平了");
                    case 2 -> System.out.println("电脑出石头，你输了");
                    case 3 -> System.out.println("电脑出布，你赢了");
                }
                break;
            case 2:
                switch (comp){
                    case 1 -> System.out.println("电脑出剪刀，你赢了");
                    case 2 -> System.out.println("电脑出石头，打平了");
                    case 3 -> System.out.println("电脑出布，你输了");
                }
                break;
            case 3:
                switch (comp){
                    case 1 -> System.out.println("电脑出剪刀，你输了");
                    case 2 -> System.out.println("电脑出石头，你赢了");
                    case 3 -> System.out.println("电脑出布，打平了");
                }
                break;
        }


    }
}
