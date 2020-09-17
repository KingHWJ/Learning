import java.io.*;

public class TransFormStream {
    // 转换流
    public static void main(String[] args) throws IOException {

        method_utf8();
        method_gbk();
        method_r_utf8();
        method_r_gbk();
    }

    // 写入流 utf8
    public static void method_utf8() throws IOException {

        OutputStreamWriter file_w = new OutputStreamWriter(new FileOutputStream("src/utf8.txt"));
        file_w.write("你好");
        file_w.close();
    }

    // 写入流 gbk
    public static void method_gbk() throws IOException {
        OutputStreamWriter file_w = new OutputStreamWriter(new FileOutputStream("src/gbk.txt"),"gbk");
        file_w.write("你好");
        file_w.close();
    }

    // 输出流 utf8
    public static void method_r_utf8() throws IOException {
        InputStreamReader file_r = new InputStreamReader(new FileInputStream("src/utf8.txt"));

        char[] chars = new char[1024];
        int len = 0;
        while ((len = file_r.read(chars))!= -1){
            System.out.println(new String(chars,0,len));
        }
    }

    // 输出流 gbk
    public static void method_r_gbk() throws IOException {
        InputStreamReader file_r = new InputStreamReader(new FileInputStream("src/gbk.txt"),"gbk");

        char[] chars = new char[1024];
        int len = 0;
        while ((len = file_r.read(chars))!= -1){
            System.out.println(new String(chars,0,len));
        }
    }
}
