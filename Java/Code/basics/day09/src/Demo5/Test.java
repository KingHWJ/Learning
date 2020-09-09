package Demo5;

/*
父类对象 对象名 = new 子类对象
* 多态中
* 1、成员变量，看左，没有则网上找
* 2、成员方法，编译时看父类，有没有这个方法，没有则编译报错；有点话，new谁就用谁（执行子类重写的该方法），没有则向上找
  3、成员方法
    成员方法：编译看左边，运行看右边
    成员变量：编译看左边，运行看左边
* */
public class Test {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
        System.out.println(obj.num);
        System.out.println(obj.tax);

        obj.methodFu();
//        obj.methodZi();

    }
}
