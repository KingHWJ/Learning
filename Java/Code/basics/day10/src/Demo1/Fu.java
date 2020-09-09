package Demo1;

public class Fu {

    int num = 10;

    public final void method(){
        System.out.println("成员方法，加了final之后，子类是不可以进行重写的");
    }
}
