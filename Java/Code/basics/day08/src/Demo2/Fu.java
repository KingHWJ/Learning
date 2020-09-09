package Demo2;

public class Fu {
    int num = 100;

    public void methodFu(){
        System.out.println("我是父类的普通方法！");
    }

    public void method(){
        int num = 200000;
        System.out.println("我是父类中的重名方法！");
        System.out.println("父类中的局部变量："+num);
        System.out.println("父类中的成员变量："+this.num);
    }
}
