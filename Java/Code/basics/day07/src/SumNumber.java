import java.util.Scanner;

public class SumNumber {
    // 计算两个数字的和
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int num1 = s1.nextInt();
        System.out.print("请输入第二个数字：");
        int num2 = s1.nextInt();
        System.out.print("两个数字之和：");
        System.out.println(num1 + num2);

    }
}
