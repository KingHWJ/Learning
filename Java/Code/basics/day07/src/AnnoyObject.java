import java.util.Scanner;

public class AnnoyObject {
    // 匿名对象
    public static void main(String[] args) {

//        Scanner s1 = new Scanner(System.in);
//        int num = s1.nextInt();
//        System.out.println("输入的数字是："+ num);
//
//        System.out.println("-------------");
//        new Person().name = "詹姆斯";

        // 匿名对象作为参数
//        methodParam(new Scanner(System.in));

        // 匿名对象作为返回值
        int num = input().nextInt();
        System.out.println("输入的数字是："+ num);

    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的数字是："+ num);

    }

    public static Scanner input( ){

        return new Scanner(System.in);
    }


}
