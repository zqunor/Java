import java.util.Scanner;

public class ScannerDemo {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s);
        int i = in.nextInt();
        System.out.println(i);
        // 循环读取String数据，当输入exit时退出循环
        while(!in.hasNext("exit")) {
            System.out.println(in.nextLine());
        }
        in.close();
    }
}