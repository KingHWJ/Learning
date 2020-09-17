package BufferedInputAndOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 缓冲字节流
public class Output {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("src/BufferedInputAndOutput/a.txt");

        BufferedOutputStream file_buffer = new BufferedOutputStream(file);

        file_buffer.write("数据写入数据缓冲流".getBytes());

        file_buffer.close();

    }



}
