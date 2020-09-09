package Demo4;

public interface AInterface {

    public default void methodA(){
        System.out.println("这是一个默认方法");
    }
}
