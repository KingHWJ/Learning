package BufferedInputAndOutput;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// 文本排序
public class BufferTest {
    public static void main(String[] args) throws IOException {

        /*
        1.创建文本输入流，读取待排序文档
        2.创建文本输出流，存放写入文档
        3.读取时。拆分每一行的数据，存入hashmap集合中

         */

        BufferedReader file_r = new BufferedReader(new FileReader("src/BufferedInputAndOutput/File/in.txt"));
        BufferedWriter file_w = new BufferedWriter(new FileWriter("src/BufferedInputAndOutput/File/out.txt"));

        HashMap<String,String> map = new HashMap<>();

        String line;
        while ((line = file_r.readLine())!=null){

            String[] arrays = line.split("\\.");

            map.put(arrays[0],arrays[1]);

        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            file_w.write(map.get(key) + "\r");
        }

        file_w.close();
        file_r.close();

    }
}
