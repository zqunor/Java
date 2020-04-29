public class MaxAndMin {
    public static void main (String[] args) {
        int [] data = {313, 89, 123, 323, 313, 15, 90, 56, 39};
        int max = data[0];
        int min = data[0];
        for(int i=1; i<data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
        }

        System.out.println("最大值"+max);
        System.out.println("最小值"+min);
    }
}