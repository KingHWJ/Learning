package Demo2;

public class Outer {
    int num = 30;

    public void innerMethod(){
         class Inner{
            int num = 20;
            public void method(){
                System.out.println(num);
            }
        }

        Inner ineer = new Inner();
         ineer.method();
    }

}
