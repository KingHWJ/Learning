public class StaticTest {
    public static void main(String[] args) {

        Student one = new Student("詹姆斯", 25);
        one.room = "101教室";
        System.out.println("学生：" + one.getName() + " 年龄：" + one.getAge() + " 班级：" + one.room + " 学号：" + one.getId());

        Student two = new Student("乔丹", 35);
        System.out.println("学生：" + two.getName() + " 年龄：" + two.getAge() + " 班级：" + two.room + " 学号：" + two.getId());

        one.method();
        one.staticMethod();
        Student.staticMethod();

        method();
        StaticTest.method();

    }


    public static void method(){
        System.out.println("这是一个静态方法");
    }
}
