package Test02;

import Test01.Zi;

public class ClassLoad {
    public static void main(String[] args) {
        new ZiTest();
    }

}

class FuTest {

    static int a = println("我是父类静态变量1");    // 1

    public FuTest() {
        System.out.println("我是父类的构造函数");  // 10
    }

    static {
        System.out.println("我是父类的静态代码块");  // 2
    }

    static int c = println("我是父类静态变量2");    // 3

    static int println(String s) {
        System.out.println(s);
        return 10;
    }

    int b = println("我是父类的普通变量1");  // 7

    {
        System.out.println("我是父类的普通代码块");  // 8
    }

    int d = println("我是父类的普通变量2");   // 9

}


class ZiTest extends FuTest {
    static int a = println("我是子类的静态变量1");   // 4
    static {
        System.out.println("我是子类的静态代码块");  // 5
    }
    static int b = println("我是子类的静态变量2");   // 6

    public ZiTest() {
        System.out.println("我是子类的构造函数");  // 14
    }

    int c = println("我是子类的普通变量1");  // 11
    {
        System.out.println("我是子类的普通代码块");  // 12
    }
    int d = println("我是子类的普通变量2");  // 13
}