import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: lzy
 * @description:
 * @date: 2020-11-27-14:59
 */
public class ChatTwoServer {
    public ChatTwoServer(int port,String name) throws IOException
    {
        ServerSocket server=new ServerSocket(port);//创建seversocket对象，提供tcp连接服务。指定端口port，等待tcp连接。
        System.out.print("正在等待连接，请勿操作！");
        Socket client=server.accept();//创建socket对象，它等待接收客户端的连接。
        new ChatTwoPackage.ChatTwoClient(name,client);//实现图形界面。
        server.close();
    }

    public static void main(String[] args) throws IOException {
        new ChatTwoServer(2001, "SQ");
    }

    }
