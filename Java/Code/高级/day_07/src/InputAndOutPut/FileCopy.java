package InputAndOutPut;

// 文件复制

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        /*
        1.一个输入字节流，用于读取数据
        2.一个输出字节流，用于写入数据
         */
        FileInputStream fi = new FileInputStream("/Users/laohangdeche/Pictures/wallroom-5120x3200-bg-dd198b3.jpg");
        FileOutputStream fo = new FileOutputStream("/Users/laohangdeche/Library/Mobile Documents/com~apple~CloudDocs/个人/学习笔记/Learning/Java/Code/高级/day_07/copy.jpg");

        long start_time = System.currentTimeMillis();
        // 提高读取效率
        byte[] bytes = new byte[1024 * 1024];
        int len = 0;
        while ((len = fi.read(bytes)) != -1){
            System.out.println(Arrays.toString(bytes));
            fo.write(bytes,0,len); // 写入有效字节长度
        }
        long use_time = System.currentTimeMillis() - start_time;
        // 先关闭写的，再关闭读的
        fo.close();
        fi.close();
        System.out.println("复制总共耗时：" + use_time + "毫秒");


    }
}
