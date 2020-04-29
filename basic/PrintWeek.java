import java.util.Scanner;

public class PrintWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int num = a % 7;
        String week = "";
        switch (num) {
            case 0 :
                week = "星期天";
                break;
            case 1 :
                week = "星期一";
                break;
            case 2 :
                week = "星期二";
                break;
            case 3 :
                week = "星期三";
                break;
            case 4 :
                week = "星期四";
                break;
            case 5 :
                week = "星期五";
                break;
            case 6 :
                week = "星期六";
                break;
        }

        System.out.println("今天是"+week);
    }
}