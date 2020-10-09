package Test01;

public class Zi extends Fu{

    public Zi() {
        super(10);
        System.out.println("我是一个子类");
    }

    @Override
    public String toString() {
        return "Zi{}";
    }

    static
    {
        System.out.println("abc");
    }
}
