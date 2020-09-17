package BufferedInputAndOutput;

import java.io.*;

// 缓冲区 字符输出流
public class BufferWriterAndReader {
    public static void main(String[] args) throws IOException {

//        methodOut();
        methodIn();

    }

    // 字符输出流
    public static void methodOut() throws IOException {
        BufferedWriter file_w = new BufferedWriter(new FileWriter("src/BufferedInputAndOutput/File/word.txt"));
        for (int i = 0; i < 10; i++) {
            file_w.write("我日");
            file_w.newLine();
        }
        file_w.flush();     // 从内存缓冲区刷进去 （可以省略）
        file_w.close();
    }

    // 字符输入流
    public static void methodIn() throws IOException{

        BufferedReader file_r = new BufferedReader(new FileReader("src/BufferedInputAndOutput/File/word.txt"));

        String word;

        while ((word = file_r.readLine()) != null){
            System.out.println(word);
        }

    }

}
