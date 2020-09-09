public class Student {
    private int id;     // 学号
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(){
        this.id = ++idCounter;

    }

    public Student(String name,int age){
        this.id = ++idCounter;
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void method(){
        System.out.println("这是一个成员方法");
    }

    public static void staticMethod(){
        System.out.println("这是一个静态方法");
    }
}
