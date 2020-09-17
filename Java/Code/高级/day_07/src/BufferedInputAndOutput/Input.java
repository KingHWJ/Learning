package BufferedInputAndOutput;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


// 读取缓冲输入流
public class Input {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src/BufferedInputAndOutput/a.txt");
        BufferedInputStream file_input = new BufferedInputStream(file);
        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = file_input.read())!= -1){
//            System.out.println((char)len);
//        }
        int len = 0 ;
        // 从流中，读取数据，存入缓冲流的数组中
        while ((len = file_input.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }

        file_input.close();

    }
}
