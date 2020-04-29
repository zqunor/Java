public class CellPhone extends TelePhone {
    public void call () {

        System.out.println("我可以打电话！");
    }

    public void message() {
        System.out.println("我可以发短信");
    }

    public static void main (String[] args) {
        CellPhone cp = new CellPhone();
        cp.call();
        cp.message();
    }
}