import java.io.File;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("/Users/laohangdeche/Downloads/尚硅谷_宋红康_JVM从入门到精通/视频");
        for (File listFile : file.listFiles()) {
            String name = listFile.getName();
            if(!name.equals(".DS_Store")){
                show(listFile);
            }
        }
    }

    public static void show(File file){
        if(file.isDirectory()){
            for (File listFile : file.listFiles()) {
                show(listFile);
            }
        }else{
            String[] words = file.getName().split("-");
//            System.out.println(words[0] + " " + words[1]);
            System.out.println(words[0] );
//            System.out.println(words[1]);
        }

    }

}
