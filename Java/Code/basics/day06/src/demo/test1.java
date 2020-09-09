package demo;

public class test1 {
    public static void main(String[] args) {

        Phone iphone = new Phone();
        iphone.brand = "苹果";
        iphone.color = "土豪金";
        iphone.price = 88886.1;
        iphone.name = "老杭的iPhone";

        System.out.println(iphone.brand);
        System.out.println(iphone.color);
        System.out.println(iphone.price);
        System.out.println(iphone.name);

        iphone.call("老杭");


    }

    public static class Phone{
        String name;
        String brand;
        double price;
        String color;

        public void call(String who) {
            System.out.printf("给%s打电话",who);
        }
    }
}
