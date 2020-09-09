package ExceptionDeal;

import java.io.FileNotFoundException;

public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException {

        read("a.ftxt");
    }

    public static void read(String path) throws FileNotFoundException{
        if(!path.equals("a.txt")){
            throw new FileNotFoundException("文件不存在");
        }
    }
}
