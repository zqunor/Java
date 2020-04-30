public class StringBuilderTest {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("I");

        System.out.println("追加字符串："+s.append(" java"));
        System.out.println("追加字符串后原字符串为："+s);
        System.out.println();

        System.out.println("插入字符串："+ s.insert(1, " love"));
        System.out.println("插入字符串后原字符串为："+s);
        System.out.println();

        System.out.println("长度为："+s.length());
        System.out.println();

        s.setCharAt(0, 'Y');
        System.out.println("替换字符后原字符串为："+s);
        System.out.println();

        System.out.println("替换java为php："+s.replace(7, 11, "PHP!"));
        System.out.println("替换后原字符串为："+s);
        System.out.println();

        System.out.println("删除部分字符:"+s.delete(10,11));
        System.out.println("删除后原字符串为："+s);
        System.out.println();

        System.out.println("反转后字符串："+s.reverse());
        System.out.println("反转后原字符串为："+s);
        System.out.println();

        System.out.println("转成字符串类型为："+s.toString());
        System.out.println("转后原字符串为："+s);
        System.out.println();
    }
}