package Demo2;

import java.util.ArrayList;
import java.util.Random;


public class Member extends User {

    public Member(String name, double left) {
        super(name, left);
    }

    public void receive(ArrayList<Integer> redList) {
        // 收红包之后，随机取其中一个

        // 获取随机一个红包
        int index = new Random().nextInt(redList.size());
        int red = redList.get(index);
        redList.remove(index);

        setLeft(getLeft() + red);
    }


}
