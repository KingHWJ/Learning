package Test04;



public class CovariantDemo {

    public static void main(String[] args) {
        Animal animal=new Animal();
        Food food=animal.behavior();
        food.eat();

        Dog dog=new Dog();
        Bone bone=dog.behavior();
        bone.eat();
    }
}
//基类
class Animal{
    public Food behavior(){
        System.out.println("Animal:");
        return new Food();
    }
}
//子类
class Dog extends Animal{
    @Override
    public Bone behavior(){
        System.out.println("Dog:");
        return new Bone();
    }
}

class Food{
    public void eat(){
        System.out.println("Animal like to eat food");
    }
}

class Bone extends Food{
    @Override
    public void eat(){
        System.out.println("Dogs like to eat bones");
    }

}
