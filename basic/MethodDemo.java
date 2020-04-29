public class MethodDemo {
    public static void main(String[] args) {
        method();
        methodDemo();
    }

    // 这里要加上static关键字 因为静方法只能调静态方法
    public static void method() {
        System.out.println("方法被调用");
    }

    public static void methodDemo() {
        System.out.println("Hello Shiyanlou");
    }
}
