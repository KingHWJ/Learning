import java.util.Scanner;

public class GetMaxNum {
    // 求三个数字的最大值
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num1 = s.nextInt();
        System.out.print("请输入一个数字：");
        int num2 = s.nextInt();
        System.out.print("请输入一个数字：");
        int num3 = s.nextInt();

//        if (num1 > num2) {
//            if (num1 > num3) {
//                System.out.println("最大的数字为：" + num1);
//            } else
//                System.out.println("最大的数字为：" + num3);
//        }else{
//            if (num2 > num3) {
//                System.out.println("最大的数字为：" + num2);
//            } else
//                System.out.println("最大的数字为：" + num3);
//        }

//        int temp = num1 > num2 ? num1 : num2;
//        int maxn = temp > num3 ? temp : num3;


        int temp = Math.max(num1,num2);
        int maxn = Math.max(temp,num3);
        System.out.println("最大的数字为：" + maxn);
    }
}
