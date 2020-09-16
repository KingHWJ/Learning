package InputAndOutPut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 换行，续写
public class OutputNextline {
    public static void main(String[] args) throws IOException {

        FileOutputStream a = new FileOutputStream("a.txt",true);

        String x = "你好";
        for (int i = 0; i < 10; i++) {
            a.write(x.getBytes());
            a.write('\r');

        }
        a.close();

    }
}
