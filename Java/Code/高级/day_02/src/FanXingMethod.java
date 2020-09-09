public class FanXingMethod {
    public static void main(String[] args) {

        FanXingClass fx = new FanXingClass();

        fx.method(1);
        fx.method(1.2);
        fx.method(null);
        fx.method("字符串");
        fx.method('a');
        fx.method(1000000L);

        FanXingClass.staticMethod(1);
        FanXingClass.staticMethod('a');
        FanXingClass.staticMethod("string");

    }


}
