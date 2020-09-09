package Demo2;

import java.util.ArrayList;

public class Manger extends User{

    public Manger(String name, double left) {
        super(name, left);
    }

    public ArrayList<Integer> send(int cnt, double totalRed) {
        ArrayList<Integer> redList = new ArrayList<>();

        // 检测余额
        if (totalRed > getLeft()) {
            System.out.println("余额不足！！！");
            return redList;
        }

        // 扣除自己的余额
        setLeft(getLeft() - totalRed);

        // 红包分成三份，整数，除不尽的算到第三份红包中
        int red = (int) totalRed / cnt;
        int mod = (int) totalRed % cnt;

        // 除最后一份红包
        for (int i = 0; i < cnt - 1; i++) {
            redList.add(red);
        }
        // 最后一份红包
        redList.add(red + mod);
        return redList;

    }
}
