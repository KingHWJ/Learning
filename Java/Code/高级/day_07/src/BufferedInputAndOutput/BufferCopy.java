package BufferedInputAndOutput;

import java.io.*;
import java.util.Arrays;

// 利用缓冲流复制文件速度
public class BufferCopy {

    public static void main(String[] args) throws IOException {
//        methodSingle();         // 38166毫秒
//        methodArray();          // 61毫秒
        methodSingleBuffer();   // 60豪秒
        methodArrayeBuffer();   // 18豪秒
    }

    public static void methodSingleBuffer() throws IOException {
        BufferedInputStream b_file_i = new BufferedInputStream(new FileInputStream("/Users/laohangdeche/Pictures/wallroom-5120x3200-bg-dd198b3.jpg"));
        BufferedOutputStream b_file_o = new BufferedOutputStream(new FileOutputStream("src/BufferedInputAndOutput/copy1.jpg"));

        long s_time = System.currentTimeMillis();
        int len = 0;
        while ((len = b_file_i.read())!= -1){
            b_file_o.write(len);
        }
        long u_time = System.currentTimeMillis() - s_time;
        System.out.println("缓冲流-单字节-复制耗时：" + u_time + "豪秒" );
        b_file_o.close();
        b_file_i.close();

    }

    public static void methodArrayeBuffer() throws IOException {
        BufferedInputStream b_file_i = new BufferedInputStream(new FileInputStream("/Users/laohangdeche/Pictures/wallroom-5120x3200-bg-dd198b3.jpg"),1024*1024);
        BufferedOutputStream b_file_o = new BufferedOutputStream(new FileOutputStream("src/BufferedInputAndOutput/copy2.jpg"),1024*1024);

        long s_time = System.currentTimeMillis();
        byte[] bytes = new byte[102];
        int len = 0;
        while ((len = b_file_i.read(bytes))!= -1){
            b_file_o.write(bytes,0,len); // 复制有效字节长度
        }
        long u_time = System.currentTimeMillis() - s_time;
        System.out.println("缓冲流-数组缓冲-复制耗时：" + u_time + "豪秒" );
        b_file_o.close();
        b_file_i.close();
    }

    public static void methodSingle() throws IOException {
        FileInputStream fi = new FileInputStream("/Users/laohangdeche/Pictures/wallroom-5120x3200-bg-dd198b3.jpg");
        FileOutputStream fo = new FileOutputStream("src/BufferedInputAndOutput/copy3.jpg");

        long start_time = System.currentTimeMillis();
        // 提高读取效率
        int len = 0;
        while ((len = fi.read()) != -1){
            fo.write(len); // 写入有效字节长度
        }
        long use_time = System.currentTimeMillis() - start_time;
        // 先关闭写的，再关闭读的
        fo.close();
        fi.close();
        System.out.println("普通-单字节-复制总共耗时：" + use_time + "毫秒");
    }

    public static void methodArray() throws IOException {
        FileInputStream fi = new FileInputStream("/Users/laohangdeche/Pictures/wallroom-5120x3200-bg-dd198b3.jpg");
        FileOutputStream fo = new FileOutputStream("src/BufferedInputAndOutput/copy4.jpg");

        long start_time = System.currentTimeMillis();
        // 提高读取效率
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fi.read(bytes)) != -1){
            fo.write(bytes,0,len); // 写入有效字节长度
        }
        long use_time = System.currentTimeMillis() - start_time;
        // 先关闭写的，再关闭读的
        fo.close();
        fi.close();
        System.out.println("普通-数组缓冲-复制总共耗时：" + use_time + "毫秒");
    }
}
