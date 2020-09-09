import java.util.ArrayList;

public class ArrayListTest5 {
    // 放四个学生类
    public static void main(String[] args) {

        ArrayList<Student> a = new ArrayList<>();

        a.add(new Student());
        a.add(new Student());
        a.add(new Student());
        a.add(new Student());

        System.out.println(a);

        System.out.println(a.get(0).getAge());

    }
}
