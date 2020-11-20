public class Swap {

    public static void main(String[] args) {

        Employee a = new Employee("Alice",100,2,3,4);
        Employee b = new Employee("Bob", 200,1,2,3);
        System.out.println("交换前： a =" + a.getName());
        System.out.println("交换前： b =" + b.getName());
        swap(a,b);
        System.out.println("交换后： a =" + a.getName());
        System.out.println("交换后： b =" + b.getName());

    }
    
    public static void swap(Employee x,Employee y){
        Employee temp = x;
        x = y;
        y = temp;
    }
}
