package Demo2;

public class Zi extends Fu {

    int num = 2000;

    public void methodZi(){
        System.out.println("我是子类的普通方法！");
    }

    @Override
    public void method(){
        int num = 1234;
        System.out.println("我是子类中的重名方法！");
        System.out.println("父类中的成员变量：" + super.num);
        System.out.println("子类中的成员变量：" + this.num);
        System.out.println("子类中的局部变量：" + num);
    }
}
