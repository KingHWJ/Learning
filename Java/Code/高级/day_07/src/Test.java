import java.io.File;

public class Test {
    public static void main(String[] args) {

        // File类的三种构造方法
        File path1 = new File("/Users/laohangdeche/Desktop");
        System.out.println(path1);
//        System.out.println(path1.isDirectory());

        File path2 = new File("/Users/laohangdeche", "/Desktop");
        System.out.println(path2);

        File path3 = new File(path1, "a.txt");
        System.out.println(path3);

        // File类的几种常用方法
        System.out.println(path1.getAbsoluteFile());
        File path4 = new File("Test.java");
        System.out.println(path4.getAbsoluteFile());
        System.out.println(path4.getPath());

        System.out.println(path1.getName());

        System.out.println(path1.length());
        System.out.println(path4.length());

        System.out.println(new File("/Volumes/老杭的U盘/资料/Java/尚硅谷/Java基础全套视频教程/day11_项目二与面向对象(中)/02-尚硅谷-Java语言基础-复习：封装性与构造器.avi").length() / 1024);

        // 判断功能
        System.out.println(path4.exists());
        System.out.println(path1.exists());
        System.out.println(path1.isDirectory());
        System.out.println(path1.isFile());
    }
}
