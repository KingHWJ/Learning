package InterfaceTest;

abstract public class A {

    int a = 10;

    void eat(){
        System.out.println("我的类是一个抽象类，但我不是抽象方法");
    }

    private Integer have(){
        return 1;
    }
    public static void main(String[] args) {

//        new A().eat();
    }

}
