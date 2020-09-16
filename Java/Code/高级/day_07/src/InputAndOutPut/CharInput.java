package InputAndOutPut;

import java.io.FileReader;
import java.io.IOException;

// 字符输入流
public class CharInput {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("a.txt");

//        System.out.println(file.read());

        int len = 0;

        // 读取单个字符
//        while ((len = file.read())!= -1){
//            System.out.println((char)len);
//        }

        // 读取多个字符
        char[] chars = new char[1024];
        while ((len = file.read(chars))!= -1){
            System.out.println(new String(chars,0,len));
        }

        file.close();
    }
}
