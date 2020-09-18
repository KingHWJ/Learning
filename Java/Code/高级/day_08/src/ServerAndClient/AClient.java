package ServerAndClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 一个客户端
public class AClient {
    public static void main(String[] args) throws IOException {

        // 1.创建一个socket对象，绑定服务器的ip地址和端口号
        Socket ss = new Socket("127.0.0.1",8888);

        // 2.获取网络输出流
        OutputStream os = ss.getOutputStream();

        // 3.利用网络输出流，write方法，发送个服务器的数据
        os.write("你好，服务器".getBytes());

        // 4.获取网络输入流
        InputStream is = ss.getInputStream();

        // 5.利用网络输入流，读取服务器发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("服务器发送的消息" + new String(bytes,0,len));
        // 6.释放资源
        ss.close();




    }
}
