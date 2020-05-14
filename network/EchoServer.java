import java.io.IOException;
import java.net.ServerSocket;

public class EchoServer {
    public static void main(String[] args) {
        try {
            //服务端需要使用 ServerSocket 类 (绑定1080端口)
            ServerSocket serverSocket = new ServerSocket(1080);

            // 阻塞 等待客户端连接
            Socket client = serverSocket.accept();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}