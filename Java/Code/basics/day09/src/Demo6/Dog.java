package Demo6;

public class Dog extends Animal {


    @Override
    public void eat() {
        System.out.println("小狗爱吃屎");
    }

    public void door(){
        System.out.println("小狗特有方法");
        System.out.println("小狗可以看门");
    }
}
