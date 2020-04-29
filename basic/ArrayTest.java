public class ArrayTest {
    public static void main(String[] args) {
      String [][] name = {{"zhaoyi", "qianer","sunsan"},{"lisi","zhouwu","wuliu"}};
      int len = name.length;
      for (int i=0;i<len;i++) {
        int arr_len = name[i].length;
        for (int j=0;j<arr_len;j++) {
            System.out.println(name[i][j]);
        }
      }
    }
}