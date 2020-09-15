import java.io.File;
import java.io.IOException;

public class CreateAndDelete {
    public static void main(String[] args) throws IOException {
        File path1 = new File("./Des/a.txt");
        System.out.println(path1.getAbsoluteFile());
        System.out.println(path1.isDirectory());
        System.out.println(path1.isFile());

//        System.out.println(path1.createNewFile());
//        System.out.println(path1.mkdir());
//        System.out.println(new File("./src/FileTest").mkdir());
//        System.out.println(new File("./src/FileTest/a/b").mkdirs());
//        System.out.println(new File("./src/FileTest").delete());
        System.out.println(new File("a.txt").delete());
    }
}
