import BufferedInputAndOutput.Output;

import java.io.*;

public class Utf8ToGBK {

    // utf8 格式文件 与 gbk文件转换
    public static void main(String[] args) throws IOException {
        /*
        1.utf8格式的读取流，读取数据
        2.gbk格式的输出流，写入utf8读取的数据
        3.释放的资源
         */

        InputStreamReader file_r = new InputStreamReader(new FileInputStream("我是utf8文件.txt"),"utf-8");
        OutputStreamWriter file_w = new OutputStreamWriter(new FileOutputStream("我是gbk文件.txt"),"gbk");

        int len = 0;
        char[] chars = new char[1024];

        while ((len = file_r.read(chars))!= -1){
            file_w.write(chars,0,len);
            System.out.println(new String(chars,0,len));
        }

        file_w.close();
        file_r.close();
    }
}
