import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarDemo {
    public static void main (String[] args) {
        System.out.println("完整显示日期时间：");
        // 字符串转换日期格式
        DateFormat fdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = fdate.format(new Date());
        System.out.println(str);

        // 创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        // 初始化 Calendar对象，但并不必要，除非需要重置时间
        calendar.setTime(new Date());

        // 显示年份
        System.out.println("年： " + calendar.get(Calendar.YEAR));

        // 显示月份 (从0开始, 实际显示要加一)
        System.out.println("月： " + calendar.get(Calendar.MONTH));

        // 当前分钟数
        System.out.println("分钟： " + calendar.get(Calendar.MINUTE));

        // 今年的第 N 天
        System.out.println("今年的第 " + calendar.get(Calendar.DAY_OF_YEAR) + "天");

        // 本月第 N 天
        System.out.println("本月的第 " + calendar.get(Calendar.DAY_OF_MONTH) + "天");

        // 3小时以后
        calendar.add(Calendar.HOUR_OF_DAY, 3);
        System.out.println("三小时以后的时间： " + calendar.getTime());
        // 格式化显示
        str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());
        System.out.println(str);

        // 重置 Calendar 显示当前时间
        calendar.setTime(new Date());
        str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());
        System.out.println(str);

        // 创建一个 Calendar 用于比较时间
        Calendar calendarNew = Calendar.getInstance();

        // 设定为 5 小时以前，后者大，显示 -1
        calendarNew.add(Calendar.HOUR, -5);
        System.out.println("时间比较：" + calendarNew.compareTo(calendar));

        // 设定7小时以后，前者大，显示 1
        calendarNew.add(Calendar.HOUR, +7);
        System.out.println("时间比较：" + calendarNew.compareTo(calendar));

        // 退回 2 小时，时间相同，显示0
        calendarNew.add(Calendar.HOUR, -2);
        System.out.println("时间比较：" + calendarNew.compareTo(calendar));

        // calendarNew创建时间点
        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendarNew.getTime()));
        // calendar创建时间点
        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime()));
        System.out.println("时间比较：" + calendarNew.compareTo(calendar));

        //太平洋时区的 ID 为 PST
        TimeZone tz0 = TimeZone.getTimeZone("PST");
        System.out.println("太平洋时区: " + tz0);

        //getDefault()可以获取主机所处时区的对象
        TimeZone tz1 = TimeZone.getDefault();
        System.out.println("默认时区: " + tz1);

        //调用Locale类中定义的常量
        Locale l1 = Locale.CHINA;
        System.out.println("Locale.CHINA= " + l1);

    }
}