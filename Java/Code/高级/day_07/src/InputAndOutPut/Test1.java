package InputAndOutPut;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {

        FileInputStream file_r = new FileInputStream("/Users/laohangdeche/Pictures/20200809.jpg");
        FileOutputStream file_w = new FileOutputStream("copy.jpg");

        int len = 0;
        byte[] bytes = new byte[1024];

        while ((len = file_r.read(bytes))!= -1){
            System.out.println(Arrays.toString(bytes));
            file_w.write(bytes);
        }

    }
}
