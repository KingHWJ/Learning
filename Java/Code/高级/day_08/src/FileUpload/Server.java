package FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);

        while (true){

            // 1、服务器ServerSocket对象

            // 2、accept方法监听，socket对象
            Socket client_s = ss.accept();

            // 3、socket获取网络输入流
            InputStream inputStream = client_s.getInputStream();

            // 4、输入流，读取接收的数据

            // 5、判断路径是否存在
            File file = new File("src/FileUpload/ServerFiles");
            if (!file.exists()) {
                file.mkdir();
            }

            String filename = "/hwj" + System.currentTimeMillis() + new Random().nextInt(100) + ".jpg";
            // 6、创建本地输出流
            FileOutputStream file_o = new FileOutputStream(file + filename);
            // 7、本地输出流，write方法，写入硬盘数据
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(bytes)) != -1) {
                file_o.write(bytes, 0, len);
            }
            // 8、创建网络输出流
            OutputStream outputStream = client_s.getOutputStream();

            // 9、发送信息给客户端
            outputStream.write("文件已上传".getBytes());

            // 10、释放资源
            client_s.close();
            file_o.close();
        }

    }
}
