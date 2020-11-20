public class EmployeeTest {
    public static void main(String[] args) {



        Employee[] l = {
                new Employee("詹姆斯",80000,1984,12,30),
                new Employee("乔丹",90000,1978,5,6),
                new Employee("科比",50000,1980,8,28)

        };

        for (Employee employee : l) {
            System.out.println(employee.getName() + employee.getId());
        }
    }






}
