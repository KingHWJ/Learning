
import java.util.Random;
import static java.lang.Math.pow;

public class ConstructorTest {
    /*
        构造的方法
    1、构造方法的重载
    2、this（。。。）调用另一个构造器
    3、无参构造器
    4、对象初始化
    5、静态初始化
    6、实例域初始化
     */

    public static void main(String[] args) {
        pow(1,2);
        EmployeeC[] staff = new EmployeeC[3];

        staff[0] = new EmployeeC("Harry",40000);
        staff[1] = new EmployeeC(80000);
        staff[2] = new EmployeeC();

        for(EmployeeC e:staff){
            System.out.println("name=" + e.getName() + ", id=" + e.getId() + ", salary=" + e.getSalary());

        }
    }

}

class EmployeeC{

    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    // 静态初始化块
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    // 对象初始化块
    {
        id = nextId;
        nextId++;
    }

    public EmployeeC(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public EmployeeC(double salary) {
        // this调用另一方构造器
        this("Employee #" + nextId,salary);
    }

    // 空构造器
    public EmployeeC() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}