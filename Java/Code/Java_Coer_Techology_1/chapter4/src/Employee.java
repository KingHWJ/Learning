import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {

    private String name;
    private double salary;
    private LocalDate hireDate;

    private static int nextId = 1;
    private int id;

    public static int getNextId() {
        return nextId;
    }

    public Employee() {
    }

    public Employee(String n, double s, int year, int month, int day){
        super(n);
        this.id = nextId;
        this.name = n;
        this.salary = s;
        this.hireDate = LocalDate.of(year,month,day);
        nextId++;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;

        return Objects.equals(name,employee.name) && salary == employee.salary
                && Objects.equals(hireDate,employee.hireDate);
    }

    public void raiseSalary(double byPercent){
        double raise = salary + byPercent/100;
        this.salary += raise;
//        this.salary = salary * (1 + byPercent);
    }

    @Override
    public String toString() {
        return  getClass().getName() +
                "[name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", id=" + id +
                ']';
    }

    public int hashCode(){
//        return 7 * name.hashCode()
//                + 11 * Double.hashCode(salary)
//                + 13 * Objects.hashCode(hireDate);

        return Objects.hash(name,salary,hireDate);
    }
}
