public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Person(int age) {
        this();
        this.age = age;
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person() {
        System.out.println("初始化Person类时，1，2，3，4，5.。。条！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
