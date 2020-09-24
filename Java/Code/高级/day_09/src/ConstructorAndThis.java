public class ConstructorAndThis {
    public static void main(String[] args) {
        Person p1 = new Person("詹姆斯");

        Person p2 = new Person("张伯伦",19);

        Account a1 = new Account(1,1000,0.12);
        a1.show();
        a1.withDraw(500);
        a1.show();
        a1.deposit(10000);
        a1.withDraw(1000);
        a1.show();
    }

}
