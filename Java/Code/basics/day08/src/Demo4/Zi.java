package Demo4;

/*
* this 关键字的用法
* 1.this代表的是本类，super代表的是父类
* 2.在本类方法中，访问本类的成员变量
* 3.在本类方法中，访问本类的其他成员方法
* */
public class Zi extends Fu {
    int num = 200;

    public Zi(){
        this(1);
    }

    public Zi(int num){
        System.out.println("hello啊");
    }

    public void method(){
        super.method();
        int num = 300;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    public void methodA(){
        this.method();
        System.out.println("这是本类的另一个方法");
    }
}
