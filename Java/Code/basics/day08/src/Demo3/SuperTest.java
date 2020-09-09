package Demo3;

public class SuperTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        NewPhone newphone = new NewPhone();

        System.out.println("老手机------");
        phone.call();
        phone.send();
        phone.show();


        System.out.println("新手机------");
        newphone.call();
        newphone.send();
        newphone.show();
    }



}
