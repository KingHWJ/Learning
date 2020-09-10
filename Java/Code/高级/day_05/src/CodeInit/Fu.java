package CodeInit;

public class Fu {

    static String fuStatic = "我是父类静态变量";

    private String name = "我是父类名";

    public Fu(String name) {
        this.name = name;
    }

    public Fu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void method(){
        System.out.println("我是父类，中同名方法");
    }

    public void methodFu(){
        System.out.println("我是父类，中特有的方法");
    }




}
