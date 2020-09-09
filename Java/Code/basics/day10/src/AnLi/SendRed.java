package AnLi;

import red.RedPacketFrame;

public class SendRed {
    public static void main(String[] args) {
        MyRed red = new MyRed("老杭的红包");

        // 设置群主名称
        red .setOwnerName("老杭");

        // 设置发红包的方式
        red.setOpenWay(new NormalMode());

    }
}
