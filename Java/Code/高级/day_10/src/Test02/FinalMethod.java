package Test02;

public class FinalMethod extends ClassLoad {

    private void method(){
        System.out.println("我是子类的，私人方法");
    }

    public static void main(String[] args) {

        new FinalMethod().method();
    }
}


class Fu{
    private void method(){
        System.out.println("我是父类的，私人方法");
    }
}
