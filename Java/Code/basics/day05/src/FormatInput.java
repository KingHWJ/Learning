import java.util.Scanner;

public class FormatInput {
    // 格式化输入
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 创建scanner对象
        System.out.print("Input your name: ");      // 打印提示
        String name = scanner.nextLine();           // 读取一行输入，并获取字符串
        System.out.print("Input you age: ");        // 打印提示
        int age = scanner.nextInt();                // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n",name,age);


        Scanner s1 = new Scanner(System.in);
        System.out.print("Input your name: ");
        var namex = s1.nextLine();
        System.out.printf("My name is %s",namex);

        if(3>2)
            System.out.print("只有一行代码时，可以省略掉{}");

        String fruit = "apple";
        switch (fruit) {
            case "apple" -> System.out.println("Selected apple");
            case "pear" -> System.out.println("Selected pear");
            case "mango" -> {
                System.out.println("Selected mango");
                System.out.println("Good choice!");
            }
            case "watermelon" -> System.out.println("我太发");
            default -> System.out.println("No fruit selected");
        }

    }
}
