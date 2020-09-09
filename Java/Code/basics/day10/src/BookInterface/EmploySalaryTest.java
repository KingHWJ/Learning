package BookInterface;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EmploySalaryTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("name=" + e.name + ",salary=" + e.salary);
        }

    }
}