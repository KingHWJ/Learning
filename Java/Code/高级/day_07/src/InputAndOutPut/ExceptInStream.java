package InputAndOutPut;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

// 流中的异常处理
public class ExceptInStream {
    public static void main(String[] args) throws IOException{
        // 普通try-catch处理
        // methodCommon();

        // jdk7 中try-catch处理
        methodJDK7();

//        methodJDK9();

    }

    public static void methodCommon() {
        // 提高文件对象的作用域
        FileWriter file = null;
        try {
            file = new FileWriter("abc/c.txt");
            for (int i = 0; i < 10; i++) {
                file.write("hallo\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (file != null) {
                // null是无法调用方法
                try {
                    file.close();  // 无论怎么样最后，都要释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void methodJDK7() {
        // 提高文件对象的作用域
        try (FileWriter file = new FileWriter("abc/c.txt")) {
            for (int i = 0; i < 10; i++) {
                file.write("hallo\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void methodJDK9() throws IOException {
        // 提高文件对象的作用域
        FileWriter file = new FileWriter("abc/c.txt");
        try {
            for (int i = 0; i < 10; i++) {
                file.write("hallo\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        file.write("10");


    }
}

