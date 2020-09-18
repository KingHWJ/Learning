import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintSTreamTest {
    // 打印流
    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("a.txt");
        PrintStream ps2 = new PrintStream(new FileOutputStream("file.txt"));

        ps2.println(102312312);
        ps2.println("这是");

        System.setOut(ps);
        System.out.println("我本来应该打印在控制台上的");
        ps.write(97);
        ps.println(97);
        ps.write("我日\n".getBytes());
        ps.println("我日");
        ps.close();

//        method();
    }

    public static void method(){
        try {
            PrintStream out = System.out;
            PrintStream ps = new PrintStream("./log.txt");

            System.setOut(ps);
            int age = 11;
            System.out.println("年龄变量成功定义，初始值为11");
            String sex = "女";
            System.out.println("年龄变量成功定义，初始值为女");
            // 整合2个变量
            String info = "这是个" + sex + "孩子，应该有" + age + "岁了";
            System.setOut(out);
            System.out.println("程序运行完毕，请查看日志");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
