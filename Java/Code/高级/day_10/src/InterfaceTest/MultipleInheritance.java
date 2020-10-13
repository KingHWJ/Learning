package InterfaceTest;

public class MultipleInheritance {
    public static void main(String[] args) {

        Mi mi = new Mi();
        mi.first();
        mi.second();
        mi.third();
    }
}


interface One {
    default void first() {
        System.out.println("first");
    }
}

interface Two {
    default void second() {
        System.out.println("second");
    }
}

interface Three {
    default void third() {
        System.out.println("third");
    }
}

class Mi implements One,Two,Three{

}