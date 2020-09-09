package Demo1;

public class Test {

    public static void main(String[] args) {
        final int a;
        a = 10;

//        a = 20;  只能赋值一次

        final int b = 20;

        for (int i = 0; i < 10; i++) {
            final int c = i;
            System.out.println(c);

        }
        final User user = new User();
        // user = new User();  引用类型局部变量，加了final之后，只能指向一个对象，地址不能再更改
    }
}