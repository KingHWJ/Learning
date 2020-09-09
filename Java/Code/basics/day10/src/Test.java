public class Test {
    public static void main(String[] args) {

        Body body = new Body();
        body.method();


        Body.Heart heart = body.new Heart();
        heart.beat();
    }
}
