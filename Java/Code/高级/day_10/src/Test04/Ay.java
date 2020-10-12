package Test04;

public class Ay {
    public static void main(String[] args) {
        Person obj = new Person();
        Flower fl  = obj.buy();
        fl.like();
        System.out.println("----------");
        Boy obj2  = new Boy();
        RoseFlower rose = obj2.buy();
        rose.love();

    }
}

class Person{

    Flower buy(){
        System.out.println("我买了一朵花");
        return new Flower();
    }
}

class Boy extends Person{
    @Override
    RoseFlower buy(){
        System.out.println("我买了一朵玫瑰，我要表白");
        return new RoseFlower();
    }
}

class Flower{

    public void like(){
        System.out.println("我是一朵花，我很漂亮");
    }

}

class RoseFlower extends Flower{
    public void love() {
        System.out.println("我是一朵玫瑰花，我既漂亮，又代表爱情");
    }
}

/*
    协变返回类型
    子类继承父类，子类重写父类方法，返回类型是父类返回类型的子类
 */