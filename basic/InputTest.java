import java.util.ArrayList;
import java.util.Scanner;

public class InputTest {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String [] str = new String[100];
        // ArrayList<String> str = new ArrayList<String>();
        int index = 0;
        while (!in.hasNext("end")) {
            str[index] = in.nextLine();
            index++;
        }

        for(int i=0; i<index; i++) {
            System.out.println(str[i]);
        }

        in.close();
    }
}