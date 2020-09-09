import java.util.Scanner;

public class StringTest3 {
    // 键盘输入一个字符串，并且统计其中各种字符出现的字数
    // 种类有：大写字母、小写字母、数字、其他
    public static void main(String[] args) {

        System.out.print("请输入字符：");
        Scanner s = new Scanner(System.in);
        String str = s.next();

        char[] str_list = str.toCharArray();

        // 定义四种类型变量
        int capLetterNum = 0;
        int smallLetterNum = 0;
        int digitNum = 0;
        int otherNum = 0;

        for (char c : str_list) {
            if ('A' <= c && c <= 'Z')
                capLetterNum++;
            else if ('a' <= c && c <= 'z')
                smallLetterNum++;
            else if ('0' <= c && c <= '9')
                digitNum++;
            else
                otherNum++;
        }

        System.out.println("大写字母的字符数：" + capLetterNum);
        System.out.println("小写字母的字符数：" + smallLetterNum);
        System.out.println("数字的字符数：" + digitNum);
        System.out.println("其他字符数：" + otherNum);

    }

}
