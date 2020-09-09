import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTest {
    public static void main(String[] args) throws ParseException{

        System.out.println(System.currentTimeMillis());

        Date date = new Date();
        System.out.println(date);

        Date date2 = new Date(0);
        System.out.println(date2);

        Date date3 = new Date();
        System.out.println(date3.getTime());        // 返回0时距今的毫秒值

        // 格式化日期，解析日期
        SimpleDateFormat stf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = stf.format(date3);
        System.out.println(str);

        demo();

    }

    public static void demo() throws ParseException {
        SimpleDateFormat stf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(stf.parse("1995-06-05 02:13:14"));
    }
}
