package BS;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);

        while (true) {
            Socket socket = ss.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        // 网络输入流 --> 字符缓冲输入流
                        BufferedReader bi = new BufferedReader(new InputStreamReader(is));
                        String add_line = bi.readLine();
                        String path_name = add_line.split(" ")[1].substring(1);
                        System.out.println(add_line);
                        FileInputStream fi = new FileInputStream(path_name);

                        OutputStream os = socket.getOutputStream();

                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());

                        // 必须写入空行
                        os.write("\r\n".getBytes());
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fi.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                    } catch (IOException e) {
                        System.out.println(e);
                    }

                }
            }).start();


        }


    }
}
