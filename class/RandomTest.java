import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        Random random = new Random();
        int n = random.nextInt(b-a+1) + a;
        System.out.println(n);
    }
}