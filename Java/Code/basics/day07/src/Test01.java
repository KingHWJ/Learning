public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("学生没改名之前------");
        System.out.printf("学生姓名是：%s，性别是：%s，年龄是：%d\n",s1.getName(),s1.isMale(),s1.getAge());



        System.out.println("学生改名之后-------");
        s1.setName("杭文杰");
        s1.setAge(25);
        s1.setMale(true);

        System.out.printf("学生姓名是：%s，性别是：%s，年龄是：%d",s1.getName(),s1.isMale(),s1.getAge());
    }
}
