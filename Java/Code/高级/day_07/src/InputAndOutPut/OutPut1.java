package InputAndOutPut;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class OutPut1 {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("a.txt");
        String a  = "你好";
        byte[] a_l = a.getBytes();
        System.out.println(Arrays.toString(a_l));
        byte[] b ={56,57,58,59,90,88};
        file.write(b);
        file.write(a_l);
        file.close();


    }
}
