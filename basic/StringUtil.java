import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int len = a.length();

        String new_str = "";
        for (int i = 0; i < len; i++) {
            char c = a.charAt(i);
            if (c == ' ') {
                continue;
            }
            new_str += c;
        }

        System.out.println(new_str);
    }
}

