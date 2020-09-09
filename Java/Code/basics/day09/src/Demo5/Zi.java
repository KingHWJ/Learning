package Demo5;

public class Zi extends Fu {
    int abc = 100;

    @Override
    public void method() {
        System.out.println("子类的方法");
    }


    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
