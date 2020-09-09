package ExceptionDeal;

import java.io.FileNotFoundException;

public class TryCatchDemo {
    public static void main(String[] args) {
        try{
            read("b.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("over");
    }

    public static void read(String path) throws FileNotFoundException{
        if(!path.equals("a.txt")){
            throw new FileNotFoundException("文件不存在");
        }
    }
}
