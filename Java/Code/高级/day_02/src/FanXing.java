import java.util.ArrayList;
import java.util.Collection;

public class FanXing {
    public static void main(String[] args) {
        
        show();
        /*
        集合不使用泛型，默认是object类型，可以存放任何类型的数据
        弊端：
            不安全，容易引发异常
         */
//        FanXingTest x = new FanXingTest();
//        x.setName("hello");
//        System.out.println(x.getName());
        FanXingTest<String> str = new FanXingTest<>();
//        str.setName(1);   定义了泛型之后，就不能设置其他的额类型
        str.setName("我是string类型");
        System.out.println(str.getName());

        // 接口类型1：直接在接口实现类中指定具体的类型
        FanXingInterfaceImpl  fx = new FanXingInterfaceImpl();
        fx.method("字符串");

        // 接口类型2：
        FanXingClass fx2 = new FanXingClass();
        fx2.method(1);
        fx2.method(10.2);
        fx2.method("字符串");

    }

    private static void show() {
        Collection<String> str = new ArrayList<>();

//        str.add(1);
        str.add("hello");
    }
}
