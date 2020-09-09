public class Dog {
    void bark(byte b){
        System.out.println("狗叫！！！");
    }

    void bark(char c){
        System.out.println("狗叫！！！");
    }

    void bark(short s){
        System.out.println("狗叫！！！");
    }

    void bark(int i){
        System.out.println("狗叫！！！");
    }

    void bark(long l){
        System.out.println("狗叫！！！");
    }

    void bark(float f){
        System.out.println("狗叫！！！");
    }

    void bark(double d){
        System.out.println("狗叫！！！");
    }

    void bark(boolean b){
        System.out.println("狗叫！！！");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark(10);
    }
}
