package Case;

public class Test {
    public static void main(String[] args) {
        Computer pc = new Computer();

        USB iMouse = new Mouse();

        Keyboard keyborad = new Keyboard();

        pc.powerOn();
        iMouse.open();
        keyborad.open();
        pc.userUsb(iMouse);
        // 自动类型转换，由下向上转型
        pc.userUsb(keyborad);
        pc.powerOff();
    }
}
