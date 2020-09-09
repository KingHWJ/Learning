import java.util.Objects;

public class Person {

    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        // 利用反射技术
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age &&
//                Objects.equals(name, person.name);
//    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        // 向下转型
        if (obj instanceof Person) {
            Person p = (Person) obj;
            // 引用类型，通过equals比较值是否相等，基本数据类型，比较值是否相等
            if (this.name.equals(p.name) && this.age == p.age) {
                return true;
            } else
                return false;
        }else
            return false;

    }

    ;

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
