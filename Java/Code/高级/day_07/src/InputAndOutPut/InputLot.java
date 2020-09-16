package InputAndOutPut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

// 一次性读取多个字节流
public class InputLot {
    public static void main(String[] args) throws IOException {
        FileInputStream a = new FileInputStream("b.txt");

        byte[] x = new byte[2];

        int len = a.read(x);
        System.out.println(len);
//        System.out.println(new String(x,0,len));
        System.out.println(new String(x));
        len = a.read(x);
        System.out.println(len);
        System.out.println(new String(x));
        len = a.read(x);
        System.out.println(len);
        System.out.println(new String(x));
        a.close();

    }
}
