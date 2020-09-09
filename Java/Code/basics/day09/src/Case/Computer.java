package Case;

/*
电脑类：
1、开机
2、关机
3、使用接口
   3.1 使用工具
   3.2 关闭工具
 */

public class Computer {

    public void powerOn(){
        System.out.println("电脑开机！！！");
    }

    public void powerOff(){
        System.out.println("电脑关机！！！");
    }

    public void userUsb(USB usb){
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard)usb;
            keyboard.type();
        }

    }
}
