import java.io.File;
import java.io.FilenameFilter;

public class RecursionTest {
    public static void main(String[] args) {

        // double num = show(30);
        // System.out.println(num);

        showDir(new File("/Users/laohangdeche/Pictures/LOL/皮肤原画"));


    }

    public static double show(int num) {
        if (num == 1) {
            return 1;
        }
        return num * show(num - 1);
    }

    public static void showDir(File path) {

        if (path.isDirectory()) {
//            System.out.println(path);
//            for (File file : path.listFiles(new FileFilterImp())) {
            for (File file : path.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return new File(dir,name).isDirectory() || new File(dir,name).getName().contains("冠军");
                }
            })) {
//                System.out.println(file);
                showDir(file);
            }
        } else {
            System.out.println(path);

        }
    }

    // 只要.java的文件
}
