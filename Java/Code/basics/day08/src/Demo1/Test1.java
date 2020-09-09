package Demo1;

public class Test1 {
    public static void main(String[] args) {
        Fu fu = new Fu();

        Zi zi = new Zi();
        fu.methodFu();
        zi.methodZi();
        // 间接访问成员变量，该方法属于谁，就优先用谁，没有再往上找
        zi.methodFu();
        System.out.println("-----------");

        System.out.println(zi.num);


    }




}
