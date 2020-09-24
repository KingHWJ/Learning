package FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

// 文件上传客户端
public class Client {
    public static void main(String[] args) throws IOException {
        // 1.创建本地字节输入流
        FileInputStream file_i = new FileInputStream("/Users/laohangdeche/Pictures/20200809.jpg");
        // 2.创建网络输出流
        Socket s_out = new Socket("127.0.0.1",8888);
        OutputStream outputStream = s_out.getOutputStream();
        // 3.本地输入，读取本地文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = file_i.read(bytes)) != -1){
            // 4.网络输出流，write方法，发送数据给服务器
            outputStream.write(bytes,0,len);
        }

        // 输出流结束标记
        s_out.shutdownOutput();

        // 5.创建网络输入流
        InputStream inputStream = s_out.getInputStream();
        // 6.网络输入流，read方法，读取，服务器发送过来的数据

        len = inputStream.read(bytes);
        System.out.println("服务器消息：" + new String(bytes,0,len));



    }

}
