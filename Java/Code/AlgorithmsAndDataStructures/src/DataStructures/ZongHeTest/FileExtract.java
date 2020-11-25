package DataStructures.ZongHeTest;

import java.io.File;

public class FileExtract {
    public static void main(String[] args) {
        File file = new File("/Users/laohangdeche/当前学习/Java/尚硅谷Java数据结构和算法/视频");

        for (File listFile : file.listFiles()) {
            System.out.println(listFile.getName());
        }

    }


}
