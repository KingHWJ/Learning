package BookInterface;

public class Employee implements Comparable {

    double salary;
    String name;

    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Object other) {
//        Employee other = (Employee) otherObject;
        return 0;
    }
}
