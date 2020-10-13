package InterfaceTest;

interface Jim1 {
    static void eat(){
    }
    default void jim() {
        System.out.println("Jim1::jim");
    }
}

interface Jim2 {
    static void eat(){}
    default void jim() {
        System.out.println("Jim2::jim");
    }
}

public class Jim implements Jim1, Jim2 {
    @Override
    public void jim() {
        Jim2.super.jim();
    }

    public static void main(String[] args) {
        new Jim().jim();
    }
}
