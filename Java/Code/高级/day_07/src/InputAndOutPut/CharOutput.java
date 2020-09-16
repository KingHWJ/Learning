package InputAndOutPut;

import java.io.FileWriter;
import java.io.IOException;

// 字符流写入
public class CharOutput {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("b.txt");

        file.write("我草你妈");

        file.flush();

//        file.close();
        file.write("\rworid\nfasdfa");

        file.flush();

        file.close();

//        file.write(100);  // 关闭之后，无法再继续使用流

    }
}
