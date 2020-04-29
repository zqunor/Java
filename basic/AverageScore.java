public class AverageScore {
    public static void main(String[] args) {
        int [] scores = {61,57,95,85,75,65,44,66,90,32};
        int len = scores.length;

        int sum = 0;
        for (int i=0; i < len; i++) {
            sum += scores[i];
        }

        System.out.println(sum/len);
    }
}