import java.io.*;

public class FileTest {

    public static void main(String[] args) throws IOException {
        show(new File("/Users/laohangdeche/Downloads/"));

    }

    public static void show (File file){

        if(file.isDirectory()){
            System.out.println("- " + file.getName());
            for (File listFile : file.listFiles()) {
                show(listFile);
            }
        }else{
            if(!file.getName().equals(".DS_Store")){
                System.out.println("    - " + file.getName());
            }
        }

    }
}
