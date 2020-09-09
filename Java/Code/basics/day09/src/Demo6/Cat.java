package Demo6;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("小猫爱吃鱼!");
    }

    public void catchMouse(){
        System.out.println("小猫特有方法");
        System.out.println("小猫可以抓老鼠");
    }
}
