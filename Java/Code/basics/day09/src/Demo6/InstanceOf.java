package Demo6;

public class InstanceOf {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
//        System.out.println(dog instanceof Dog);
//        System.out.println(dog instanceof Cat);
        giveAPet(dog);
    }

    public static void giveAPet(Animal animal){
        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.door();
        }
        else if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }

    }


}
