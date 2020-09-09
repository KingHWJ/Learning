

public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker",75000,1987,12,15);
        staff[1] = new Employee("Harry Cracker",50000,1989,10,1);
        staff[2] = new Employee("Tony Tester",40000,1990,3,15);

        System.out.println("修改工资之前--------------");
        for (Employee e:staff){
           System.out.printf("name=%s,salary=%s,hireDate=%s",e.getName(),e.getSalary(),e.getHireDay());
           System.out.println("");
           e.raiseSalary(5);
       }
       System.out.println("修改工资之后--------------");
       for (Employee e:staff){
           System.out.printf("name=%s,salary=%s,hireDate=%s",e.getName(),e.getSalary(),e.getHireDay());
           System.out.println("");
       }
    }

}
