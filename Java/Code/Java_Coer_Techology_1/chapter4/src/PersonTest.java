public class PersonTest {
    public static void main(String[] args) {

        Person[] p = new Person[2];
        p[0] = new Employee("杭文杰",500000,1995,6,5);
        p[1] = new Student("詹姆斯","化学");

        for (Person person : p) {
            System.out.println(person.getDescription());

        }
    }
}
