import java.util.Scanner;

public class Test04 {
    // scanner 类的使用
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("请输入一个数字：");
        int num = s1.nextInt();
        System.out.println("输入的数字是: "+num);

        System.out.print("请输入一个数字母：");
        String str = s1.next();
        System.out.println("输入的字符串是："+str);

    }
}
