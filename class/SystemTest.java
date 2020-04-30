import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.home"));

        int[] a = {2, 4, 6, 8, 10};
        int[] b = {1, 3, 5, 7, 9};

        System.arraycopy(a, 1, b, 1, 3);
        System.out.println(Arrays.toString(b));
    }
}