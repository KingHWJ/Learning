import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BirthDays {
    // 计算一个人出生了多少天
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为yyyy-MM-dd: ");
        String str = sc.next();

        // 解析日期
        SimpleDateFormat stf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = stf.parse(str);

        // 将日期转换为毫秒值
        long birth_ms = birthday.getTime();

        // 当期日期
        Date now = new Date();
        long now_ms = now.getTime();

        long living_day = (now_ms - birth_ms) / 1000 / 24 / 60 / 60;

        System.out.println("您的出生日期为：" + str + " 总共出生了：" + living_day + "天");


    }
}
