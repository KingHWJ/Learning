
public class FloatTest {
    public static void main(String[] args) {
        double r1 = 25.5444;
        double r2 = 25.54434;

        if (r1 == r2) {
            System.out.println("这两个数相等");
        }

        // 整数类型转换成浮点类型
        int a = 5;
        double d = 1.2 + 24.0/a;
        System.out.println(d);
        System.out.println();

        // 复杂四则运算中，两个整型计算时，不会转换成浮点型
        double d2 = 1.2 + 24/5;
        System.out.println(d2);

        // 除数为0，会报错
        double d3 = 0.0 / 0;
        double d4 = 1.0 / 0;
        double d5 = -1.0 / 0;
        System.out.println(d3);         // NaN
        System.out.println(d4);         // Infinity
        System.out.println(d5);         // -Infinity

        int i = 1;
        byte j = 2;
        int h = i + j;
        System.out.println(h);

        // 强制类型转换
        // int --> byte
        byte x = (int) 3;
        System.out.println(x);
        float y = (float)(x+1);
        System.out.println(y);

        x = (byte)(j+10);
        System.out.println(x);

        d5 = (int)23.566;
        System.out.println(d5);
    }
}
