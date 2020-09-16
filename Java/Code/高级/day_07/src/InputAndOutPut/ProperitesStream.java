package InputAndOutPut;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

// 属性集合
public class ProperitesStream {
    public static void main(String[] args) throws IOException {

//        methodUse();

//        methodStore();

        methodLoad();
    }

    public static void methodUse(){
        Properties p = new Properties();

        // 因为是和IO流要有联动，所以最好是字符串
        p.setProperty("詹姆斯","2.03");    // 不推荐使用put方法
        p.setProperty("乔丹","1.98");
        p.setProperty("姚明","2.23");

        System.out.println(p);
        System.out.println(p.getProperty("詹姆斯"));

        // 获取集合中的key，组成set
        Set<String> str_list = p.stringPropertyNames();
        System.out.println(str_list);
        for (String s : str_list) {
            System.out.println(s + ":" + p.getProperty(s));
        }

    }

    public static void methodStore() throws IOException {
        FileWriter file = new FileWriter("aa.txt");

        Properties p = new Properties();
        p.setProperty("詹姆斯","2.03");    // 不推荐使用put方法
        p.setProperty("乔丹","1.98");
        p.setProperty("姚明","2.23");

        p.store(file,"update_player");


    }

    public static void methodLoad() throws IOException {
        FileReader file = new FileReader("aa.txt");
        Properties p = new Properties();

        p.load(file);

        Set<String> strings = p.stringPropertyNames();
        System.out.println(strings);
        for (String string : strings) {
            System.out.println(string + ":" + p.getProperty(string));
        }



    }
}
