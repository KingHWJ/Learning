package Test1;

public class BClass {
    public void show(){
        AClass aa = new AClass();

        // aa.showA1();    // private 方法，同包的类，不能访问
        aa.showA2();        // default 同包访问以上权限
        aa.showA3();        // 拥有不同包子类以上权限
        aa.showA4();        // public 公开权限
    }
}
