package Demo;

// 这是一个普通类
public abstract class Cat extends Animal {

    @Override
    public void eat(){
        System.out.println("小猫爱吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("小猫爱睡觉");
    }

    @Override
    public void shout(){
        System.out.println("小猫爱叫唤");
    }
}
