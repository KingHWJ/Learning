public class Test {
    Test() {
        System.out.println("我是一个默认构造器");
    }

    Test(String s) {
        System.out.println("这是一个加了参数的构造器" + s);
    }

    void method(String s,int i){
        System.out.println("这是一个方法");
    }

    void method(int i,String s){
        System.out.println("这是另一个一个方法");
    }

    public static void main(String[] args) {
        new Test();
        new Test("123");
        Test obj = new Test();
        obj.method(10,"15");
        obj.method("15",15);
    }

}
