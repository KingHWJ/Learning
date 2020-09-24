public class Zi extends Fu {

    int a = 20;
    public String eat(){
        System.out.println("我是子类方法");
        return "1";
    }

    public static void main(String[] args) {
        Fu obj  = new Zi();
        obj.eat();
        System.out.println(obj.a);

        Zi obj2 = (Zi)obj;
        System.out.println(obj2.a);
    }
}
