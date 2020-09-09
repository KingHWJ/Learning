import java.util.ArrayList;

public class ArrayListTest3 {
    // 如何在ArrayList中存储基本类型数据
    // 需要用到包装类
/*
  基本类型
byte        Byte
char        Character
int         Integer
long        Long
float       Float
double      Double
boolean     Boolean
 */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
