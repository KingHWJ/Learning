import java.io.*;

public class FileTest {

    public static void main(String[] args) throws IOException {

        BufferedReader bi = new BufferedReader(new FileReader("/Users/laohangdeche/Downloads/尚硅谷大数据之Hadoop视频/4.视频"));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bi.read())!= -1){
            System.out.println(len);
        }

    }
}
