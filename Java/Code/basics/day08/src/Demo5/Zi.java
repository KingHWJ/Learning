package Demo5;

public class Zi extends Fu {
    int num = 5;

    public void method(){
        System.out.println("父类变量：" + super.num);
        System.out.println("子类变量：" + num);
    }
}
