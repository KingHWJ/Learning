

// 主调用方法
public class Main{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "hwj";
        s.age = 15;
        System.out.println(s);
        System.out.println(s.name);
        System.out.println(s.age);
        s.eat();
        s.study();

        System.out.println("--------------------");
        Phone p1 = new Phone();
        p1.brand = "苹果";
        p1.price = 6599.99;
        p1.color = "红色";

        p1.call("杭文杰");
        p1.send_msg();

    }
}


class Student {

    String name;        // 姓名
    int age;            // 年龄
    public void study(){
        // 学习
        System.out.println("我喜欢学习");
    }

    public void eat(){
        // 吃饭
        System.out.println("我喜欢吃饭");
    }
}


