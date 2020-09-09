package Demo;

// 这是一个抽象类
public abstract class Animal {
    // 这是一个抽象方法
    public abstract void eat();
    public abstract void sleep();
    public abstract void shout();

    public Animal(){
        System.out.println("hello，我是一个动物类");
    }


}
