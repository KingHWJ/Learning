package InputAndOutPut;

import java.io.FileInputStream;
import java.io.IOException;

public class Input1 {
    // 输入流
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("b.txt");
//        System.out.println(file.read());
//        System.out.println(file.read());
//        System.out.println(file.read());
//        System.out.println(file.read());
        int st = 0;
        while ((st = file.read()) != -1) {
            System.out.println((char)st);

        }

        file.close();

    }
}
