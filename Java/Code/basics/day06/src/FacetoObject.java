public class FacetoObject {
    // 面向对象
    String name;        // 姓名
    int age;            // 年龄
    public void study(){
        // 学习
        System.out.println("我可以学习");
    }

    public void eat(){
        // 吃饭
        System.out.println("我可以吃饭");
    }

    public static void main(String[] args) {
        FacetoObject a = new FacetoObject();
        a.study();
        a.eat();
        System.out.println(a.name);
    }

}
