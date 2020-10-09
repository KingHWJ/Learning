package Test01;

public class Fu {

    Fu(int i){
        System.out.println("我是父类的有参构造函数，参数为：" + i);
    }



    {
        System.out.println("我是父类的普通代码域");
    }

    static {
        System.out.println("我是父类的静态代码域");
    }
}
