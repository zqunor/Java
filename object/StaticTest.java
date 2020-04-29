public class StaticTest {
    public static String string = "static shiyanlou";
    public String str = "shiyanlou";
    public static void main(String[] args) {
        System.out.println(StaticTest.string);
        StaticTest staticTest = new StaticTest();
        System.out.println(staticTest.str);
    }

}