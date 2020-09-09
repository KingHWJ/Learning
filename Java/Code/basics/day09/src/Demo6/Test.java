package Demo6;

public class Test {
    public static void main(String[] args) {
        // 向上转型
        Animal cat = new Cat();
        Cat cat2 = new Cat();
        Animal dog = new Dog();

        cat.eat();

        // 向下转型
        Cat cat3 = (Cat)cat;
//        Cat cat4 = (Cat)dog;  ClassCastException类映射错误
        cat3.catchMouse();
        cat3.eat();

        cat2.eat();
        cat2.catchMouse();


    }
}
