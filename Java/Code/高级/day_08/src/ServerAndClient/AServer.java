package ServerAndClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 一个服务器类
public class AServer {
    public static void main(String[] args) throws IOException {

        // 1.创建一个serverSocket对象
        ServerSocket ss = new ServerSocket(8888);

        // 2.监听客户端套接字对象
        Socket server = ss.accept();

        // 3.获取网络输入流
        InputStream is = server.getInputStream();

        // 4.读取客户端的信息
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("客户端信息：" + new String(bytes, 0, len));

        // 5.获取网络输出流
        OutputStream os = server.getOutputStream();

        // 6.写入信息，发送给客户端
        os.write("你好，客户端，我收到了".getBytes());

        // 7.释放资源
        ss.close();
        server.close();

    }
}
