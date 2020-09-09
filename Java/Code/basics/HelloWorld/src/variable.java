import java.nio.file.FileSystemLoopException;

public class variable {
    public static void main(String[] args){
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        boolean b1 = true;
        System.out.println(b1);
        boolean b2 = 5 > 3;
        System.out.println(b2);
        boolean b3 = 10 < 9;
        System.out.println(b3);

        // 单字符
        char c1 = 'a';
        char c2 = '子';
        System.out.println(c1);
        System.out.println(c2);

        // 字符串
        String s1 = "abc";
        String s2 = "中国话";
        System.out.println(s1);
        System.out.println(s2);

        // 常量
        final double pi = 3.14;
        System.out.println("这是一个常量"+pi);

        var x = 13.222;
        System.out.println(x);
        System.out.println(s1.getClass());

//        强制类型转换，当高范围向低范围转换时，会丢掉前面的字节，导致数据错误
        int aa = 23431134;
        int bb = (short) aa;
        System.out.println(aa);
        System.out.println(bb);


        System.out.println("====");


        long l2 = 2000000000000000000L;
        System.out.println(l2);

        float f2 = 3.14F;
        System.out.println(f2);

        byte b4 = 12;
        System.out.println(b4);

        // 同时给3个变量赋值
        // 方法1
        int aaa,bbb,ccc;
        aaa = 100;
        bbb = 200;
        ccc = 300;
        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(ccc);

        // 方法2
        int ddd = 400,eee = 500,fff = 600;
        System.out.println(ddd);
        System.out.println(eee);
        System.out.println(fff);
    }
}
