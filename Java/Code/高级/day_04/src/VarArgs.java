class A{}

public class VarArgs {
    static void printArray(Object[] args){
        for (Object obj : args) {
            System.out.print(obj + " ");


        }
    }

    public static void main(String[] args) {
        printArray(new Object[] {47,2.5,11.1,(float)2.99});
        printArray(new Object[] {new A(),new A(),new A()});
    }

}
